package Day07;

public class Shape {
    protected String colour="red";
    protected boolean filled=true;

    public Shape() {
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "colour=" + colour + ", filled=" + filled + '}';
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;

    }

    public double getPerimeter() {
        return 2 * (length + width);

    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}
class Square extends Rectangle {
    public Square() {
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + getSide() + '}';
    }
}
class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;

    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;

    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
class Mani {
    public static void main(String[] args) {
        Square square = new Square(5, "red", true);
        System.out.println(""+square);
        System.out.println(""+square.getPerimeter());
        System.out.println(""+ square.getArea());
    }
}

