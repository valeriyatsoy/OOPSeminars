package shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
//        Circle smallCircle = new Circle(2.0);
//        Circle bigCircle = new Circle(15.0);
//        Rectangle rectangle = new Rectangle(3.4, 5.6);
//        shapes[0] = smallCircle;
//        shapes[1] = bigCircle;
//        shapes[2] = rectangle;

        shapes[0] = new Circle(2.0);
        shapes[1] = new Circle(15.0);
        shapes[2] = new Rectangle(3.4, 5.6);

        for (Shape shape: shapes){
            shape.calculateArea();
        }
    }
}