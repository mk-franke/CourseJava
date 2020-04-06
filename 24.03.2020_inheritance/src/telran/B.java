package telran;

public class B extends A {

    protected String x = ("class B");

    protected void printB() {
        System.out.println(x);
        System.out.println("B -> " + ((A)this).x);
    }

}
