package telran.data;

public class WildAnimal extends Animal {

    private String habitat;
    private double population;

    public WildAnimal(String animalName, int age, String sex, String color) {
        super(animalName, age, sex, color);
    }

    public WildAnimal(String animalName, int age, String sex, String color, String habitat, double population) {
        super(animalName, age, sex, color);
        this.habitat = habitat;
        this.population = population;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "WildAnimal {" +
                "habitat =" + habitat +
                ", population = " + population + "}";
    }

    public void migration(){
        System.out.println(getAnimalName() + " is going south");
        System.out.println(super.getAge() + " years old");
    }

    @Override
    public void run() {
        System.out.println(getAnimalName() + " is running faster");
    }

}
