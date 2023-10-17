public class PC {
    void typesOfPC(){
        System.out.println("There are two different personal computers named " +
                "as Desktops and Laptops");
    }
}
class Desktop extends PC{
//    void typesOfDesktop(){
//        System.out.println("Desktop computers fall into three main families named as tower," +
//                " Computer and All-in-one");
//    }
}
class TestInheritance{
//    public static void main(String[] args) {
//        Desktop desktop=new Desktop();
//        desktop.typesOfDesktop();
//        desktop.typesOfPC();
//
//        System.out.println();
//        Laptop laptop =new Laptop();
//        laptop.typesOfLaptop();
//        laptop.typesOfPC();
//    }
public static void main(String[] args) {
    Tablet tablet=new Tablet();
    tablet.typesOfTablet();
    tablet.typesOfPC();
    tablet.typesOfLaptop();

}
}
class Laptop extends PC{
    void typesOfLaptop(){
        System.out.println("There are different Laptops named as Notebook,Macbook," +
                "Ultrabook,Tablet etc.");
    }
}
class Tablet extends Laptop{
    void typesOfTablet(){
        System.out.println("There are different tablets named as \n" +
                "Convertible tablets, hybrid tablets and rugged tablets");
    }
}
