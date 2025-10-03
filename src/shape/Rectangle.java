package shape;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}
