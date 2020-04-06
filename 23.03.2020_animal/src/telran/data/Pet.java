package telran.data;

public class Pet extends Animal {

    private String nickName;
    private String nameOfOwner;


    public Pet(String animalName, int age, String sex, String color) {
        super(animalName, age, sex, color);
    }

    public Pet(String animalName, int age, String sex, String color, String nickName, String nameOfOwner) {
        super(animalName, age, sex, color);
        this.nickName = nickName;
        this.nameOfOwner = nameOfOwner;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String toString() {
        return "Pet {" +
                "nickName = " + nickName +
                ", nameOfOwner = " + nameOfOwner + "}";
    }

    public void play(){
        System.out.println(nickName + " is playing");
        System.out.println(nickName + " is " + super.getAge() + " years old");
    }

}
