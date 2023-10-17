library(ggplot2)
library(shiny)
library(datasets)
data("mtcars")

# Define UI for application that draws a histogram
ui <- fluidPage(

    # Application title
    titlePanel(h3(strong("Motor Trend Car Road Tests"),style="color:blue")),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
            h4(strong("Description"),style="color:red"),
            br(),
            p("The data was extracted from the 1974 Motor Trend US magazine, and
              comprises fuel consumption and 10 aspects of automobile design and
              performance for 32 automobiles (1973-74 models)",align="justify"),
            img(src="download.jpeg",height=200,width=200,align="center"),
            selectInput("outcome",label = "Outcome",choices = names(mtcars)),
            selectInput("expVar",label = "Explanatory Variable",
                        choices = list("Displacement(cu.in)","Gross Horsepower","Rear Axle Ratio
                                       ","Weight","1/4 Mile Time","Engine","Transmission","Number of Forward Gears"))
            
            
        ),

        # Show a plot of the generated distribution
        mainPanel(
           tabsetPanel(
             tabPanel("Scatterplot"),plotOutput("scatterplot"),
             tabPanel("Box Plot"),plotOutput("boxplot"),
             tabPanel("Correlagram"),plotOutput("correlagram"),
             tabPanel("Help"),tableOutput("help")
           )
        )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {

    output$scatterplot<-renderPlot({
      
      ggplot(data=mtcars, aes(x=, y=mpg))+geom_point(fill="cyl",size=4,shape=24,color="yellow")+
        xlab("disp")+ylab("mpg")
      
    })
    
}

# Run the application 
shinyApp(ui = ui, server = server)
