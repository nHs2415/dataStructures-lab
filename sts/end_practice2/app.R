library(shiny)

# Define UI for application that draws a histogram
ui <- fluidPage(

   
    titlePanel("Uploading File"),

    # Sidebar with a slider input for number of bins 
    sidebarLayout(
        sidebarPanel(
            fileInput("file",label = "Choose CSV File",multiple = T,accept = c("text/csv",
                                                                              "text/comma-seperated-values,text/plain",
                                                                              ".csv")),tags$hr(),
            checkboxGroupInput("header",label = " ",choices =list("Header")),
            radioButtons("Separator",label = "Separator",
                         choices = list(Comma=",",Semicolon=";",Tab="\t")),
            radioButtons("Quote",label = "Quote",
                         choices = list(None="","Double Quote"='"',"Single Quote"="'"),
                         selected = '"'),
            radioButtons("Display",label = "Display",
                         choices = list(Head="head",All="all"),
                         selected = "head")
        ),

        # Show a plot of the generated distribution
        mainPanel(
          tableOutput("contents")
        )
    )
)

# Define server logic required to draw a histogram
server <- function(input, output) {
  
    output$contents<-renderTable({
      req(input$file1)
      df<-read.csv(input$file1$detapath,
                   header = input$header,
                   sep = input$Seperator,
                   quote = input$Quote)
      
      if(input$Display=="head"){
        return(head(df))
      }else{
        return(df)
      }
    })
}

# Run the application 
shinyApp(ui = ui, server = server)
