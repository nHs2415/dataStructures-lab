public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,4);
        System.out.println("Area and Circumference of the Rectangle");
        System.out.println("Area = "+rectangle.getArea());
        System.out.println("Circumference ="+rectangle.getCircumference());

        Circle circle=new Circle(5);
        System.out.println("Area and Circumference of the Circle");
        System.out.println("Area = "+circle.getArea());
        System.out.println("Circumference = "+circle.getCircumference());

        Shapes[] s=new Shapes[2];
        Rectangle r=new Rectangle(23,65);
        Circle c=new Circle(44);
        s[0]=r;
        s[1]=c;

        for (int i=0;i<s.length;i++){
            System.out.println(s[i].getArea());
            System.out.println(s[i].getCircumference());
        }
    }
}

interface Shapes{
    float getArea();
    float getCircumference();
}

class Rectangle implements Shapes{
    float length;
    float width;
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    @Override
    public float getArea() {
        return this.length*this.width;
    }

    @Override
    public float getCircumference() {
        return (this.length+this.width)*2;
    }
}
class Circle implements Shapes{
    float r;
    public Circle(float radius){
        this.r=radius;
    }
    @Override
    public float getArea() {
        return (float) Math.PI*this.r*this.r;
    }

    @Override
    public float getCircumference() {
        return (float) (2*Math.PI*this.r);
    }
}
