package telran.data;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle: " + getColor() +
                ", length: " + length +
                ", width: " + width +
                ", area: " + getArea();
    }

}
