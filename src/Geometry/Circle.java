package Geometry;

public class Circle {
    private double radius;

    public Circle ( double radius ) {
        if( radius > 0 ) {
            this.radius = radius;
        }
    }
    public double getArea( ) {
            return (Math.PI*Math.pow(this.radius,2));
    }

    public double getCircum( ) {
        return ( 2* Math.PI* this.radius );
    }
}

