package telran.data;

public abstract class AnimalAbstract {

    protected int age;
    protected String name;

    public AnimalAbstract(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public AnimalAbstract(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("I'm playing");
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal: " + name +
                ", " + age +
                " years";
    }

}
