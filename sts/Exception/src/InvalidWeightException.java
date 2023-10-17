import java.util.Scanner;

public class InvalidWeightException extends Exception{
    InvalidWeightException(String str){
        super(str);
    }
}

class Demo2{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the weight : ");
        int w= sn.nextInt();
        Demo2 d=new Demo2();
        try {
            d.weightCheck(w);
        }catch (InvalidWeightException e){
            System.out.println("An error occurred : "+e);
        }
    }
    void weightCheck(double weight) throws InvalidWeightException{
        if (weight<50){
            throw new InvalidWeightException("Your weight is less than 50.so you cannot donate blood.");
        }else {
            System.out.println("You can donate blood.");
        }
    }
}
