import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int d = n - (a + b + c);

        char[] letters = {'A', 'B'};
        int[] digits = {1, 2};

        for (int i = 0, j = 0; j < a; i++, j++) {
            System.out.print(letters[i % 2]);
        }

        for (int i = 0, j = 0; j < b; i++, j++) {
            System.out.print(Character.toLowerCase(letters[i % 2]));
        }

        for (int i = 0, j = 0; j < c; i++, j++) {
            System.out.print(digits[i % 2]);
        }

        for (int i = 1, j = 0; j < d; i++, j++) {
            System.out.print(letters[i % 2]);
        }
    }
}