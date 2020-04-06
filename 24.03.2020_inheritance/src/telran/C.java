package telran;

public class C extends B {

    protected String x = ("class C");

    protected void printC(){
        System.out.println(x);
        System.out.println("C -> " + ((B)this).x);
        System.out.println("C -> " + super.x);
        System.out.println("C -> " + ((A)this).x);
    }

}
