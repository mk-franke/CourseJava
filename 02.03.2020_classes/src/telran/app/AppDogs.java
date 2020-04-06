package telran.app;

import telran.data.Dog;

public class AppDogs {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobik", 3, "Husky", 38);
        Dog dog2 = new Dog("Sharik", 5, "Pudel", 16);

        dog1.dogRun();
        dog2.dogSleep();

        dog1.display();
        System.out.println();
        dog2.display();
        System.out.println();
        System.out.println(dog1.getNickname());
        dog1.setNickname("Bublik");
        System.out.println(dog1.getNickname());

        System.out.println(dog1.toString());
    }

}
