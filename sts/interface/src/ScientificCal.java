public class ScientificCal {
    public ScientificCal(){
        System.out.println("This is the default constructor of Scientific Calculator");
    }
    public ScientificCal(double a){
        this();
        System.out.println("This is the single parameter constructor of Scientific Calculator");
    }
    public ScientificCal(double a,double b){
        this(a);
        System.out.println("This is the two parameter constructor of Scientific Calculator");
    }
}
class Demo1{
    public static void main(String[] args) {
        //ScientificCal scientificCal=new ScientificCal(3.8,9.9);
        ClassicalCal classicalCal=new ClassicalCal(5.9);
    }

}

class ClassicalCal extends ScientificCal{
    ClassicalCal(){
        System.out.println("This is the default constructor of classic Calculator");
    }

    ClassicalCal(double a){
        this();
        System.out.println("This is the single parameter constructor of classic Calculator");
    }
    ClassicalCal(double a,double b){
        super(4.5,8.6);
        System.out.println("This is the two parameter constructor of classic Calculator");
    }


}
