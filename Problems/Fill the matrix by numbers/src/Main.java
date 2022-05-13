import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int defineLength = scanner.nextInt();
        int[][] matrix = new int[defineLength][defineLength];

        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            for (int j = i; j >= 0; j--) {
                matrix[i][m] = j;
                m++;
            }
            for (int k = 1; k < matrix.length - i; k++) {
                matrix[i][m] = k;
                m++;
            }
        }
        for (int p = 0; p < matrix.length; p++) {
            for (int q = 0; q < matrix.length; q++) {
                System.out.print(matrix[p][q] + " ");
            }
            System.out.println();
        }
    }
}