package telran.app;

import telran.data.Pillow;

public class AppPillows {

    public static void main(String[] args) {

        Pillow pillow1 = new Pillow("cotton", "duck", 45, 30);
        Pillow pillow2 = new Pillow("cotton", "goose", 30, 20);
        Pillow pillow3 = new Pillow("cotton", "chicken", 25, 15);

        Pillow[] pillows = {pillow1, pillow2, pillow3};
        System.out.println(pillows.length);
        printPillowArray(pillows);

    }

    public static void printPillowArray(Pillow[] pillows){
        for (int i = 0; i < pillows.length; i++) {
            pillows[i].print();
        }
    }

}



