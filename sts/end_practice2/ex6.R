library(shiny)

# Define UI for application that draws a histogram
ui <- fluidPage(
  
  
  titlePanel("sliders"),
  
  # Sidebar with a slider input for number of bins 
  sidebarLayout(
    sidebarPanel(
      radioButtons("type",label = "Distribution type:",
                   choices = c("Normal"="norm","Uniform"="unif",
                               "Log-normal"="lnorm","Exponential"="exp")),
      br(),
      sliderInput("obs",label = "Number of observations:",
                  min = 1,max = 1000,value = 500)
    ),
    
    # Show a plot of the generated distribution
    mainPanel(
      tabsetPanel(type = "tabs",
                  tabPanel("Plot",plotOutput("plot")),
                  tabPanel("Summary",verbatimTextOutput("summary")),
                  tabPanel("Table",tableOutput("table"))
      )
    )
  )
)

# Define server logic required to draw a histogram
server <- function(input, output) {
  
  d<-reactive({
    dist<-switch(input$dist,
                 norm = rnorm,
                 unif = runif,
                 lnorm = rlnorm,
                 exp = rexp,
                 rnorm)
    dist(input$n)
  })
  
  output$Plot<- renderPlot({
    dist<- input$dist
    n<-input$n
    
    hist(d(),
         main = paste("r",dist,"(", n, ")",sep = ""),
         col="#75AADB",border="white"
    )
  })
  
  output$Summary<-renderPrint({
    summary(d())
  })
  output$Table<- renderTable({
    d()
  })
}

# Run the application 
shinyApp(ui = ui, server = server)