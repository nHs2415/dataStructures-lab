import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FineDetails[] fineDetailsArray=new FineDetails[100];
        try {
            FileReader f=new FileReader("D:/sts/pp17_18/fineDetails.txt");
            BufferedReader br=new BufferedReader(f);
            String str;
            str=br.readLine();
            int index=0;
            while (str!=null){
                String[] fields=str.split(",");

                FineDetails fineDetails=new FineDetails(fields[0],fields[1],Integer.parseInt(fields[2]));

                fineDetailsArray[index]=fineDetails;

                index++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File does not exist...!");
        }catch (IOException e){
            System.out.println("This file is not readable");
        }


    }
}

class FineDetails{
    private String userName;
    private String bookName;
    private int noOfDaysLate;

    public FineDetails(String userName, String bookName, int noOfDaysLate) {
        this.userName = userName;
        this.bookName = bookName;
        this.noOfDaysLate = noOfDaysLate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfDaysLate() {
        return noOfDaysLate;
    }

    public void setNoOfDaysLate(int noOfDaysLate) {
        this.noOfDaysLate = noOfDaysLate;
    }
    @Override
    public String toString(){
        return "FineDetails{"+
                "userName='"+userName+'\''+
                ", bookName='"+bookName+'\''+
                ", numberOfDaysLate="+noOfDaysLate+
                '}';

    }
}