import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] arrayOccur = new int[defineLength];

        for (int i = 0; i < arrayOccur.length; i++) {
            arrayOccur[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        int counter = 0;
        for (int checker : arrayOccur) {

            if (checker == n) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}