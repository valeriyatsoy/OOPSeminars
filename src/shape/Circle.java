package shape;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle: " + area);
    }
}
