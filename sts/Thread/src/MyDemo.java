import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        try {
            FileReader f=new FileReader("D:\\COMPUTER_SCIENCE\\CS1051\\uom\\myFile.txt");
            BufferedReader bf=new BufferedReader(f);
            String str;
            str= bf.readLine();
            while (str!=null){
                list.add(str);
                str=bf.readLine();
            }
        }catch (IOException e){
            System.out.println("File not found");

        }

        for (String s:list){
            System.out.println(s);
        }

    }
}
