import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();

        int[] array = new int[defineLength];

        for (int i = 0; i < defineLength; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = false;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == n && array[i - 1] == m ||
                    array[i] == m && array[i - 1] == n) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}