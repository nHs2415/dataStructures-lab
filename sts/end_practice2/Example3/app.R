
library(shiny)

# Define UI for application that draws a histogram
ui <- fluidPage(

    # Application title
    titlePanel("Student Information"),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
            p("Please enter your basic information below"),
            textInput("Name",label = "Full Name:"),br(),
            sliderInput("age",label = "Age:",min = 18,max = 28,value = c(18,28)),
            selectInput("gender","Gender:",choices = list("Malle","Female")),
            textInput("address",label = "Addrress:"),
            textInput("number",label = "Contact Number"),
        ),

        # Show a plot of the generated distribution
        mainPanel(
          strong( h4("Answer the following questions and update your details.")),br(),
          radioButtons("university",label = "1.Select the university:",
                       choices = list("University of Colombo",
                                      "University of Peradeniya",
                                      "University of Kelaniya",
                                      "University of Sri Jayawardenepura",
                                      "University of Jaffna")),
          selectInput("course",label = "2.Select the course you follow:",
                      choices = list("Biological Science","Physical Science","Other")),
          dateInput("date",label = "4.Select the entrance date:",format = "dd-mm-yyyy",startview = "25-11-2020"),
          fileInput("id","5.Upload your NIC copy",multiple = TRUE),
          numericInput("count","6.Number of principle subjects:",value = 3,min = 1,max = 5),
          submitButton("Update my details",icon = "refresh")
        )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {

    
}

# Run the application 
shinyApp(ui = ui, server = server)
