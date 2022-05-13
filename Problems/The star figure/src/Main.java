import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner luvos = new Scanner(System.in);
        int n = luvos.nextInt();
        char[][] figure = new char[n][n];

        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure.length; j++) {
                if (i == j /*left diagonal*/ ||
                        j == (figure.length - 1) / 2 /*vertical*/ ||
                        j == figure.length - 1 - i /*right diagonal*/ ||
                        i == (figure.length - 1) / 2 /*horizontal*/) {
                    figure[i][j] = '*';
                } else {
                    figure[i][j] = '.';
                }
            }
        }

        for (char[] chars : figure) {
            for (char anChar : chars) {
                System.out.print(anChar + " ");
            }
            System.out.println("");
        }
    }
}