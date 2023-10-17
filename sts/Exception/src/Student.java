import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws Exception{
        int attendance,midMark;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter attendance : ");
        attendance=scanner.nextInt();
        System.out.print("Enter mid marks : ");
        midMark=scanner.nextInt();

        Student student=new Student();
        try {
            student.checkEligibility(attendance,midMark);
        }catch (Exception e){
            System.out.println("there is an exception : "+e);
        }


    }

    void checkEligibility(int attendance,int mark) throws Exception{
        if(attendance<80 || mark<40){
            throw new Exception("You are not eligible");
        }else {
            System.out.println("Congratulations.You are eligible for the final examination");
        }
    }
}
