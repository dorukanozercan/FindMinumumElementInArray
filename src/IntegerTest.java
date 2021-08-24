import java.util.Arrays;
import java.util.Scanner;

public class IntegerTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count number:");
        int count = scanner.nextInt();
        int[] myArray = readInteger(count);
        System.out.println("myarray is : "+Arrays.toString(myArray));

        int minimumValue = findMin(myArray);
        System.out.println("minimum value is : " + minimumValue);
    }

    private static int[] readInteger (int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


}
