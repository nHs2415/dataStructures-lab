import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter input 01 : ");
        int input1=sn.nextInt();
        System.out.print("Enter input 02 : ");
        int input2=sn.nextInt();
        MyException myException=new MyException();
        myException.calculate(input1,input2);

        try {
            myException.calculate(input1,input2);
        }catch (ArithmeticException e){
            System.out.println("An exception occurred.. "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error.array index is out of bound"+e);
        }
    }

    void calculate(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int[] arr={1,2,3,4,5};
        int i=a/b;
        System.out.println(arr[i]);

    }
}
