import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] sequenceArray = new int[defineLength];

        for (int i = 0; i < sequenceArray.length; i++) {

            sequenceArray[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        boolean containsN = false;

        for (int x : sequenceArray) {

            if (x == n) {
                containsN = true;
            }
        }

        System.out.println(containsN);
    }
}