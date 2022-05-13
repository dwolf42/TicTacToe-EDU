import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();

        int[] array = new int[defineLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isBesides = true;

        for (int j = 1; j < array.length; j++) {

            if (array[j] == n && array[j - 1] == m || array[j] == m && array[j - 1] == n) {
                isBesides = false;
                break;
            }
        }

        System.out.print(isBesides);
    }
}