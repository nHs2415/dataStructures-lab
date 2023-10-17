

library(shiny)

# Define UI for application that draws a histogram
ui <- fluidPage(

    # Application title
    titlePanel(h2("ABC Book Store Database")),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
            strong(h3("Welcome to the",br(),"ABC Book Store",style="color:red",align="center"))
        ),

        # Show a plot of the generated distribution
        mainPanel(
           
        )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {

    
    
}

# Run the application 
shinyApp(ui = ui, server = server)
