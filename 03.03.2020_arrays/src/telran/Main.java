package telran;

public class Main {

    public static void main(String[] args) {

        int size = 20;
        int[] arr = new int[size];
        fillArray(arr);
        printArray(arr);
        System.out.println();

        int[] arrEven = evenArray(arr);
        printArray(arrEven);
        System.out.println();

        int[] arrOdd = oddArray(arr);
        printArray(arrOdd);

    }

    public static void fillArray(int[] array){
        for (int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*20);
        }
    }

    public static void printArray(int[] array){
        for (int num: array) {
            System.out.print(num + " ");
        }
    }

    public static int evenCount(int[] array){
        int count = 0;
        for (int num: array) {
            if(num%2==0){ count++; }
        }
        return count;
    }

    public static int oddCount(int[] array){
        return array.length - evenCount(array);
    }

    public static int[] evenArray (int[] array){
        int[] evenNumbers = new int[evenCount(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                evenNumbers[index++] = array[i];
//                index++;
            }
        }
        return evenNumbers;
    }

    public static int[] oddArray (int[] array){
        int[] oddNumbers = new int[oddCount(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                oddNumbers[index++] = array[i];
            }
        }
        return oddNumbers;
    }

}
