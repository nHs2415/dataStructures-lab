import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
            int num1=12,num2,answer;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter number2 : ");

        try {
            num2=scanner.nextInt();
            answer=num1/num2;
            System.out.println("Answer is "+answer);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch (InputMismatchException e){
            System.out.println("Invalid type");
        }
    }
}
