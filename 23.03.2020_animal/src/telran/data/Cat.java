package telran.data;

public class Cat extends AnimalAbstract {

    public Cat(int age){
        super(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println("I'm playing with a mouse");
    }

    @Override
    public void voice() {
        System.out.println("meow-meow");
    }

    @Override
    public String toString() {
        return super.toString() + " Cat: " + name +
                ", " + age +
                " years";
    }

}
