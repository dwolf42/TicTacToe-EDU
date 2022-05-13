import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] array = new int[defineLength];
        boolean isAscending = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
                isAscending = true;
                break;
            }
        }
        System.out.println(isAscending ? "false" : "true");
    }
}