
library(shiny)

# Define UI for application that draws a histogram
ui <- fluidPage(

    # Application title
    titlePanel(strong(h1("ABC Travels"))),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
            helpText("Please select the vehicle,seat category and number of seats you want to book"),
            selectInput("choose",label = "Choose a vehicle you would like to tavel in:",
                        choices = list("Bus","Van","Train")),
            numericInput("count",label = "Number of seats:",value = 3,min = 1,max = 5)
        ),

        # Show a plot of the generated distribution
        mainPanel(
           textOutput("selected_vehicle"),
           tableOutput("values")
        )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {
    output$selected_vehicle<-renderText({
      paste("You have chose to travel in a ",input$choose)
    })
    sliderValues<-reactive({
      data.frame(
        Vehicle_Type=input$choose,
        NUmber_of_Seats=as.character(input$count)
      )
      
    })
    output$values<-renderTable({
      sliderValues()
    })
}

# Run the application 
shinyApp(ui = ui, server = server)
