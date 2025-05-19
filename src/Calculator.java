import Geometry.Circle;
import Geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle( 5.5);
        System.out.println("Area of circle: "+cir.getArea());
        Rectangle rac = new Rectangle( 4,7);
        System.out.println("Area of Rectangle: "+ rac.getArea());
    }
}