package Practice;


class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1.0/2)*h*b);
    }
}
class EquilateralTriangle extends Triangle {
    public void area(int h, int b) {
        System.out.println(0.5*h*b);
    }
}
class Circle extends Shape{
    public void area (int r){
        System.out.println((3.142)*r*r);
    }
}

public class OOPS_Inh {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        EquilateralTriangle eq = new EquilateralTriangle();
        Circle circle = new Circle();
        shape.area();
        eq.area(3,7);
        triangle.area(4, 5);
        circle.area(3);
    }
}


