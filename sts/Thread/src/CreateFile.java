import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File f=new File("myFile1.txt");
            if (f.exists()){
                System.out.println("File already exists");
                System.out.println(f.getPath());
            }else {
                System.out.println("File created successfully...!");
            }
            if (f.createNewFile()){
                System.out.println("File created : "+f.getPath());
            }else {
                System.out.println("FIle already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}
