package Day08;

public class Rectangle implements IShape{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}
class Triangle implements IShape {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base + height) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }
}
interface IShape {
    double getArea();
}
class Main1 {
    public static void main(String[] args) {
        IShape rectangle = new Rectangle(6, 3.2);
        System.out.println(""+rectangle);
        System.out.println(""+rectangle.getArea());
        IShape triangle = new Triangle(4, 9);
        System.out.println(""+triangle);
        System.out.println(""+triangle.getArea());
    }
}

