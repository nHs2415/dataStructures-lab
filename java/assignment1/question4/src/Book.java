class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

class Author {
    Person person;
    String authID;

    public Author(Person person, String authID) {
        this.person = person;
        this.authID = authID;
    }

    public void printAuthorDetails() {
        System.out.println("Author: " + person.firstName + " " + person.lastName + ", Age: " + person.age + ", ID: " + authID);
    }

    public String categorizeAuthor() {
        if (person.age >= 45) {
            return "Junior";
        } else {
            return "Senior";
        }
    }
}

class Book {
    String bookName;
    Author author;
    String serialNumber;
    String genre;
    int numberOfCopys;
    boolean isRare;

    public Book(String bookName, Author author, String serialNumber, String genre, int numberOfCopys, boolean isRare) {
        this.bookName = bookName;
        this.author = author;
        this.serialNumber = serialNumber;
        this.genre = genre;
        this.numberOfCopys = numberOfCopys;
        this.isRare = isRare;
    }

    public void printBookData() {
        System.out.println("Book: " + bookName + ", Serial Number: " + serialNumber + ", Genre: " + genre);
        author.printAuthorDetails();
        System.out.println("Number of Copies: " + numberOfCopys + ", Rarity: " + (isRare ? "Rare" : "Not Rare"));
    }
}

class Librarian {
    Person person;
    int rank;
    String librarianID;

    public Librarian(Person person, int rank, String librarianID) {
        this.person = person;
        this.rank = rank;
        this.librarianID = librarianID;
    }

    public void increaseRank() {
        rank++;
    }

    public String getBookLabel(Book book) {
        if (!book.isRare) {
            return "N";
        }
        if (book.numberOfCopys < 5 || book.author.categorizeAuthor().equals("Senior")) {
            return "RL";
        }
        return "R";
    }

    public void printLabel(Book book) {
        if (rank >= 5) {
            System.out.println("Book label for " + book.bookName + ": " + getBookLabel(book));
        }


        System.out.println("Librarian rank is not high enough to label books.");
    }
}

public class Driver {
    public static void main(String[] args) {
        // Create librarian objects
        Librarian librarian1 = new Librarian(new Person("Joe", "Hardy", 17), 10, "LI001");
        Librarian librarian2 = new Librarian(new Person("Natasha", "El", 47), 2, "LI006");

        // Create author objects
        Author author1 = new Author(new Person("Daniel", "Brown", 58), "AU001");
        Author author2 = new Author(new Person("Stephen", "King", 79), "AI002");
        Author author3 = new Author(new Person("Derek", "Palacio", 47), "AI003");

        // Create book objects
        Book book1 = new Book("Da Vinci Code", author1, "TM012", "Thriller", 10, true);
        Book book2 = new Book("Origin", author1, "TM02", "Thriller", 1, true);
        Book book3 = new Book("IT", author2, "H004", "Horror", 13, true);
        Book book4 = new Book("The Mortifications", author3, "PF002", "Political fiction", 2, false);

        // Call printBookData() for all 4 books
        book1.printBookData();
        System.out.println();
        book2.printBookData();
        System.out.println();
        book3.printBookData();
        System.out.println();
        book4.printBookData();
        System.out.println();

        // Call printLabel() for all 4 books using librarian objects
        librarian1.printLabel(book1);
        System.out.println();
        librarian1.printLabel(book2);
        System.out.println();
        librarian1.printLabel(book3);
        System.out.println();
        librarian1.printLabel(book4);
        System.out.println();

        librarian2.printLabel(book1);
        System.out.println();
        librarian2.printLabel(book2);
        System.out.println();
        librarian2.printLabel(book3);
        System.out.println();
        librarian2.printLabel(book4);
        System.out.println();
    }
}

/*------------------------------Question4------------------------------------*/
/*----------------------------------s20510----------------------------------*/