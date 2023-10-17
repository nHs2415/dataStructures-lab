

library(shiny)


# Define UI for application that draws a histogram
ui <- fluidPage(

    # Application title
    titlePanel("ABC Book Store Database"),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
          h3(strong("Welcome to the ABC Book Store"), style = "color:red; text-align:center"),
          helpText("Please enter the number of books sold during the week days."),
          numericInput("mon",label = "Monday:", min = 0, max = 20, value = 0),  numericInput("tue",label = "Tuesday:", min = 0, max = 20, value = 0),  numericInput("wed",label = "Wednesday:", min = 0, max = 20, value = 0),  numericInput("thu",label = "Thursday:", min = 0, max = 20, value = 0),  numericInput("fri",label = "Friday:", min = 0, max = 20, value = 0)
        
        
        ),

        # Show a plot of the generated distribution
        mainPanel(
          h2("Analysis of the Book Sale", style = "color:blue; text-align:center"),  
          textOutput("interpretation"),
          plotOutput("barplot")
          )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {
  
    
    
}

# Run the application 
shinyApp(ui = ui, server = server)
