package telran.data;

public class Square extends Shape {

    private double length;

    public Square(Color color, double length) {
        super(color);
        this.length = length;
    }

    public double getSize() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString() + " Square: " + getColor() +
                ", length: " + length +
                ", area: " + getArea();
    }

    @Override
    public double getArea() {
        return length*length;
    }

}
