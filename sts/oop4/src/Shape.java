public abstract class Shape {
    abstract double getArea(double value);
    abstract double getPerimeter(double value);

}

class Circle extends Shape{

    @Override
    double getArea(double value) {
        double area= Math.PI*(value*value);
        return area;
    }

    @Override
    double getPerimeter(double value) {
        double perimeter=2*Math.PI*value;
        return perimeter;
    }
}

class Square extends Shape{

    @Override
    double getArea(double value) {
        double area=value*value;
        return area;
    }

    @Override
    double getPerimeter(double value) {
        double perimeter=4*value;
        return perimeter;
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Circle");
        System.out.println(circle.getArea(5));
        System.out.println(circle.getPerimeter(5));

        System.out.println("Square");
        Square square=new Square();
        System.out.println(square.getArea(4));
        System.out.println(square.getPerimeter(4));
    }

}
