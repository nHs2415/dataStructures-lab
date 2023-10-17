import java.io.*;

public class S20510 {

    public double amount;


    public static void calculateFine(String[] fields,double amount){
        String str=fields[2];
        int  numberOfDays=Integer.parseInt(str);
        if (numberOfDays<=7 && numberOfDays>0){
            amount=numberOfDays*20;
        } else if (numberOfDays>7 && numberOfDays<=14) {
            amount=7*20+(numberOfDays-7)*100;
        }else {
            amount=7*20+7*100+(numberOfDays-14)*150;
        }
        System.out.println(fields[0]+","+amount);

    }
    public static void main(String[] args) {
        final String inputFilePath="D:/sts/pp17_18/fineDetails.txt";
        String outputFilePath="D:/COMPUTER_SCIENCE/CS1051/fineReport";
        try {
            FileReader fr = new FileReader(inputFilePath);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                String line = br.readLine();
                String[] fields = line.split(",");
                br.close();
            }

        }catch (FileNotFoundException e){
                System.out.println("File is not found");
                e.printStackTrace();
        }catch (IOException e){
            System.out.println("file is not readable");
            e.printStackTrace();
        }

        try{
            FileWriter fw=new FileWriter(outputFilePath);
            fw.write(S20510.calculateFine());

            fw.close();
            System.out.println("Successfully write the content of the file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        S20510 s1=new S20510();
        s1.calculateFine("");
    }




}
