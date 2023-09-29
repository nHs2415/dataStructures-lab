import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Movie {
    int id;
    String name;
    double rating;

    public Movie(int id,String name,double rating){
        this.id=id;
        this.name=name;
        this.rating=rating;
    }

    public void display(){
        System.out.println("Movie ID : "+this.id+"\tMovie Name : "
                +this.name+"\tMovie rating : "+this.rating);
    }
    void writeToFile(){
        try {
            FileWriter f2=new FileWriter(name.concat(".txt"));
            BufferedWriter bw=new BufferedWriter(f2);
            bw.write(String.valueOf(id));
            bw.newLine();
            bw.write(name);
            bw.newLine();
            bw.write(String.valueOf(rating));
            bw.newLine();
            bw.flush();
            bw.close();
        }catch (IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

}
class Driver{
    public static void main(String[] args) {
        Movie[] movies=new Movie[5];
    }
    public static void readFile(Movie[] movies){
        try{
            FileReader f=new FileReader("data.txt");
            BufferedReader br=new BufferedReader(f);
            String line;
            int index=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                Movie movie=createMovie(line);
                movies[index]=movie;
                index++;
            }
            if (br==null){
                br.close();

            }
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static Movie createMovie(String line){
        StringTokenizer tokenizer=new StringTokenizer(line,",");
        int id = Integer.parseInt(tokenizer.nextToken());
        String name = tokenizer.nextToken();
        double rating = Double.parseDouble(tokenizer.nextToken());

        Movie movie = new Movie(id,name,rating);
        return movie;
    }
    public static void displayMovies(Movie[] movies){
        if(movies.length==0){
            System.out.println("No movies found.");
        }else {
            for (Movie movie : movies){
                movie.display();
            }
        }
    }
    public static void search(Movie[] movies){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the movie that want to search : ");
        String searchName=scanner.nextLine();
        
        Movie foundMovie=null;
        for (Movie movie:movies){
            if (movie.name.equals(searchName)){
                foundMovie=movie;
                break;
            }
        }
        if (foundMovie==null){
            System.out.println("Movie not found.");
            return;
        }
        
        foundMovie.display();
        System.out.println("1.write movie information to file");
        System.out.println("2.Return to main menu");
        
        int choice;
        do {
            System.out.println("Enter your choice : ");
            choice= scanner.nextInt();
            if (choice==1){
                foundMovie.writeToFile();
                break;
            } else if (choice==2) {
                break;
            }else {
                System.out.println("Invalid choice.Please try again..");
            }
        }while (true);
    }
    public static void displayMenu(Movie[] movies){

        Movie movie=new Movie(0,"Harry Potter and the Sorcerer\'s Stone",7.6);

        System.out.println("Movie Manager\n");
        System.out.println("1. Load movies");
        System.out.println("2. display all movies");
        System.out.println("3. Search a movie");
        System.out.println("4. Exit");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        while (true){
            switch (choice){
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                    movie.display();
                    break;
                case 3:
                    search(movies);
                    break;
                case 4:
                    System.out.println("Existing the program.");
                    break;
                default:
                    System.out.println("Invalid choice.enter between 1-4");
            }
        }


    }


}


/*
--------------------------------s20510_Q3--------------------------------
 */