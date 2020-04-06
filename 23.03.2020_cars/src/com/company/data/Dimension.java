package com.company.data;

public class Dimension {

    private int length;
    private int width;
    private int height;
    private int weight;

    public Dimension(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public void setLength(int length) { this.length = length; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "Dimension {" + length + " x " + width + " x " + height + " cm, " + weight + " kg}";
    }

}
