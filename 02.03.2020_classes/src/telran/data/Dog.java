package telran.data;

public class Dog {
//    поля, конструкторы, методы

    private String nickname;
    private int age;
    private String breed;
    private double weight;
    public boolean dogStatus;

    public Dog(String nickname, int age, String breed, double weight){
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    public void dogSleep(){
        dogStatus = true;
    }

    public void dogRun(){
        dogStatus = false;
    }

    public String getNickname(){
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("Nickname: " + nickname);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println(nickname + " " + (dogStatus? "sleep":"run"));
    }

    @Override
    public String toString() {
        return "Dog: " +
                "nickname = '" + nickname + '\'' +
                ", age = " + age +
                ", breed = '" + breed + '\'' +
                ", weight = " + weight +
                ", dogStatus = " + dogStatus;
    }

}
