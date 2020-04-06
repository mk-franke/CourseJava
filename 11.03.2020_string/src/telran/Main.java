package telran;

public class Main {

    public static void main(String[] args) {

        int a = 50;
        int b = 50;
        Integer c = 500;
        Integer d = 500;

        System.out.println(a==b); //примитивы - сравниваются значения в ячейке памяти
        System.out.println(c==d); //два разных объекта с разными ячейками памяти
        System.out.println(c.equals(d));
        System.out.println(c.compareTo(d));

        System.out.println();

        String str = "Hello! ";
        String str1 = "Vasya!";
        System.out.println(str.equals(str1));

        str1 = str.concat(str1);
        System.out.println(str1);

        str1 = str1.replace("! ", ", ");
        System.out.println(str1);

        System.out.println(str1.codePointAt(1));

        String str2 = "one, two, three, ";
        String[] str3 = str2.split(", ");
        System.out.println(str3[0]);

        String str4 = "not alone";
        System.out.println(changeString(str4));
        System.out.println(startWithNot(str4) ? removeNot(str4) : addNot(str4));

    }

    public static String changeString(String str){
        if(str.startsWith("not")){
            return str.substring(4) + " not";
        } else {
            return "not " + str;
        }
    }

    public static boolean startWithNot(String input){
        return input.startsWith("not");
    }

    public static String addNot(String input){
        return "not " + input;
    }

    public static String removeNot(String input){
        return input.substring(4) + " not";
    }

}
