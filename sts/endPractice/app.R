library(shiny)


ui<-fluidPage(
  titlePanel(
    title = "ABC Travels"
  ),
  sidebarLayout(
    sidebarPanel(
      helpText("Please selsct the vehicle.seat category and number of seat you want to book."),
      selectInput("vehicle",label = "Choose a vehicle you would like to travel in:",
                  choices = list("Train","Bus","Van")),
      numericInput("number",label = "Number of seats:",
                   value = 3,min = 1,max = 5)
    ),
    mainPanel(
      p("You have chose to travel in a Bus"),
      textOutput("select_vehicle"),
      tableOutput("table")
    )
  )
  
)
  

server <- function(input, output){
  output$select_vehicle<-renderText({
    
  })
}

shinyApp(ui = ui, server = server)
