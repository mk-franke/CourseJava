package telran.data;

public class Dog extends AnimalAbstract{

    public Dog(int age, String name){
        super(age, name);
    }

    public void play(){
        System.out.println("I'm playing with a ball");
    }

    @Override
    public void voice() {
        System.out.println("gav-gav");
    }

    @Override
    public String toString() {
        return super.toString() + " Dog: " + name +
                ", " + age +
                " years";
    }

}
