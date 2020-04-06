package telran.data;

public class Pillow {

    public String feather;
    public String material;
    public int length;
    public int width;

    public Pillow(String feather, String material, int length, int width) {
        this.feather = feather;
        this.material = material;
        this.length = length;
        this.width = width;
    }

    public String getFeather() {
        return feather;
    }

    public String getMaterial() { return material; }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void display(String feather, String material, int width, int length){
        System.out.println("Feathers are " + feather);
        System.out.println("Material is " + feather);
        System.out.println("Length is " + feather);
        System.out.println("Width is " + feather);
    }

    public void print () {
        System.out.println(material + " " + feather + " " + length + " " + width);
    }

}
