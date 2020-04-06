package telran.data;

public class WaterPipe implements Printable, Stateable{

    @Override
    public void print() {
        System.out.println("I'm a pipe");
    }

    @Override
    public void printState(int n) {
        System.out.println(n == OPEN ? "Water pipe is open" : n == CLOSED ? "Water pipe is closed" : "State is invalid");
     /*
        if (n==OPEN){
            System.out.println("Water pipe is open");
        } else if (n==CLOSED){
            System.out.println("Water pipe is closed");
        } else {
            System.out.println("State is invalid");
        }
     */
    }

}
