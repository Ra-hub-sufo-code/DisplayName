package Geometry;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {

            this.width = width;
            this.length = length;
    }

    public double getArea ( ) {
        return width*length;
    }
    public double getPara( ) {
        return 2*(length+width);
    }
}
