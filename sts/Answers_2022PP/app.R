library(shiny)


ui <- fluidPage(

    
    titlePanel(h2(strong("Motor Trend Car Road Tests"),style = "color:blue")),
    
    sidebarLayout(
      sidebarPanel(
        h3("Discripttion",style = "color:red"),
        h4("The data was extracted from the 1974 Motor Trend US magazine, and
          comprises fuel consumption and 10 aspects of automobile design
          and performance for 32 automobiles (1973-74 models)",align = "justify"),
        div(img(src = "images.jpeg"))
      ),  
      mainPanel(
        
      )
      
      
    )

    
)

# Define server logic required to draw a histogram
server <- function(input, output) {}

# Run the application 
shinyApp(ui = ui, server = server)
