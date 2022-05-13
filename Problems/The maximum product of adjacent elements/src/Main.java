import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int[] calculation = new int[size];

        for (int j = 1; j < array.length; j++) {
            calculation[j - 1] = array[j] * array[j - 1];

        }

        int max = 0;

        for (int k = 0; k < calculation.length; k++) {

            if (calculation[k] > max) {
                max = calculation[k];
            }
        }

        System.out.println(max);
    }
}