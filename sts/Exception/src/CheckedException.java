import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        FileInputStream file;
        try {
            file=new FileInputStream("D:/COMPUTER_SCIENCE/CS1051/uom/myFile.txt");
        }catch (FileNotFoundException e) {
            System.out.println("File not Found : "+e);
            return;
        }
        int c;
        try {
            while ((c = file.read()) != -1) {
                System.out.print((char) c);
            }
            file.close();
        }catch (IOException e){
            System.out.println("Error occurred");
        }
    }
}
