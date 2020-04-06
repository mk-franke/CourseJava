public class Main {
    public static void main(String[] args) {

        System.out.println(nearestTo10(5, 12));

    }

    public static int nearestTo10(int a, int b) {
        int diffA = Math.abs(a-10);
        int diffB = Math.abs(b-10);

        return (diffA==diffB) ? 0:(diffA<diffB) ? a:b;
    }

}
