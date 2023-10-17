import java.util.Scanner;

public class SubjectThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running...!   ");
        Scanner sn=new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Enter subject name : ");
            String sName = sn.nextLine();
            System.out.println("Subject "+(i+1)+" "+sName);

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted");
            }
        }
    }
}
class Demo{
    public static void main(String[] args) {
        SubjectThread st=new SubjectThread();
        st.start();
        System.out.println("The main thread terminated");
    }
}
