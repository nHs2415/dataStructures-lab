import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void myStaticMeth(){
        System.out.println("mcksdcnj");
    }

    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();
        cars.add("gbs");
        cars.add("fnf");
        Collections.sort(cars);
        for (String i : cars){
            System.out.println(i);
        }
    }
}