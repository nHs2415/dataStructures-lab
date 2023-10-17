import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("myFile1.txt",true);
            fw.write("Files in java be tricky, but ok");
            fw.close();
            System.out.println("Success...");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
