package Day08;

public class Circle {
    protected double radius;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double result;
        result =Math.PI * radius *radius;
        return result;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
class Cylinder extends  Circle {
    private double height;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        double surfaceArea;
        surfaceArea = 2 * Math.PI * radius * (height + radius);
        return surfaceArea;
    }
    @Override
    public String toString() {
        return "Cylinder{"+super.toString() + "height=" + height + '}';
    }
}
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.4);
        System.out.println(""+circle);
        System.out.printf("Area = %.2f\n",circle.getArea());
        Cylinder cylinder = new Cylinder(6, circle.radius);
        System.out.println(""+cylinder);
        System.out.printf("Surface Area = %.2f\n",cylinder.getArea());
    }
}
