// My first solution

package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] partsOfInput = scanner.nextLine().toUpperCase().split("");

        scanner.close();

        // That's the way to paradise - oh wait, it's just the game board - lol
        String[][] board = {{" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}
        };

        // indexOnPartOfInput; is to count which index (token) of partsOfInput[] should be put into
        // which position of the board[][]
        int indexOnPartOfInput = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = partsOfInput[indexOnPartOfInput];
                indexOnPartOfInput++;
            }
        }

        // >>> X win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right
        // or from top right to bottom left are "X"
        boolean xWinLeftDiagonal = board[0][0].equals("X") &&
                board[1][1].equals("X") &&
                board[2][2].equals("X");

        boolean xWinRightDiagonal = board[0][2].equals("X") &&
                board[1][1].equals("X") &&
                board[2][0].equals("X");

        // True if the indexes that are building horizontal lines left to right are "X"
        boolean xWinHorizontal1 = board[0][0].equals("X") &&
                board[0][1].equals("X") &&
                board[0][2].equals("X");

        boolean xWinHorizontal2 = board[1][0].equals("X") &&
                board[1][1].equals("X") &&
                board[1][2].equals("X");

        boolean xWinHorizontal3 = board[2][0].equals("X") &&
                board[2][1].equals("X") &&
                board[2][2].equals("X");

        // True if the indexes that are building vertical lines top to bottom are "X"
        boolean xWinVertical1 = board[0][0].equals("X") &&
                board[1][0].equals("X") &&
                board[2][0].equals("X");

        boolean xWinVertical2 = board[0][1].equals("X") &&
                board[1][1].equals("X") &&
                board[2][1].equals("X");

        boolean xWinVertical3 = board[0][2].equals("X") &&
                board[1][2].equals("X") &&
                board[2][2].equals("X");


        // >>> O win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right
        // or from top right to bottom left are "O"
        boolean oWinLeftDiagonal = board[0][0].equals("O") &&
                board[1][1].equals("O") &&
                board[2][2].equals("O");

        boolean oWinRightDiagonal = board[0][2].equals("O") &&
                board[1][1].equals("O") &&
                board[2][0].equals("O");

        // True if the indexes that are building horizontal lines left to right are "O"
        boolean oWinHorizontal1 = board[0][0].equals("O") &&
                board[0][1].equals("O") &&
                board[0][2].equals("O");

        boolean oWinHorizontal2 = board[1][0].equals("O") &&
                board[1][1].equals("O") &&
                board[1][2].equals("O");

        boolean oWinHorizontal3 = board[2][0].equals("O") &&
                board[2][1].equals("O") &&
                board[2][2].equals("O");

        // True if the indexes that are building vertical lines top to bottom are "O"
        boolean oWinVertical1 = board[0][0].equals("O") &&
                board[1][0].equals("O") &&
                board[2][0].equals("O");

        boolean oWinVertical2 = board[0][1].equals("O") &&
                board[1][1].equals("O") &&
                board[2][1].equals("O");

        boolean oWinVertical3 = board[0][2].equals("O") &&
                board[1][2].equals("O") &&
                board[2][2].equals("O");

        // --- Impossible conditions ---

        // >>> Impossible horizontal <<<
        boolean impossibleHorizontal = xWinHorizontal1 && oWinHorizontal2 ||
                xWinHorizontal1 && oWinHorizontal3 ||
                xWinHorizontal2 && oWinHorizontal3 ||
                oWinHorizontal1 && xWinHorizontal2 ||
                oWinHorizontal2 && xWinHorizontal3 ||
                oWinHorizontal1 && xWinHorizontal3;

        // >>> Impossible vertical <<<
        boolean impossibleVertical = xWinVertical1 && oWinVertical2 ||
                xWinVertical1 && oWinVertical3 ||
                xWinVertical2 && oWinVertical3 ||
                oWinVertical1 && xWinVertical2 ||
                oWinVertical2 && xWinVertical3 ||
                oWinVertical1 && xWinVertical3;

        // >>> Impossible ratio <<<
        int X = 0;
        int O = 0;

        for (String s : partsOfInput) {
            if (s.equals("X")) {
                X++;
            } else if (s.equals("O")) {
                O++;
            }
        }
        // If you subtract X by O and the result is > 1 there are
        // impossible/invalid moves. The Math.abs function is to
        // "turn" a negative result of this calculation to a positive.
        int ratioXtoO = Math.abs(X - O);

        // --- Printer ---

        // This part is printing the 3x3 board to the screen, also adds the lines around the board
        System.out.println("---------"); // Top board line
        for (String[] boardArrayString : board) {
            System.out.print("| "); // Leading vertical bar
            for (String boardString : boardArrayString) {
                System.out.print(boardString + " ");
            }
            System.out.print("|" + '\n'); // Tailing vertical bar
        }
        System.out.println("---------"); // Lower board line

        // Prints the actual status of the game

        // Print when win combination's impossible
        boolean impossible = ratioXtoO > 1 || impossibleHorizontal || impossibleVertical;
        if (impossible) {
            System.out.println("Impossible");
        }
        // Print wins for X or O
        else if (xWinLeftDiagonal || xWinRightDiagonal ||
                xWinHorizontal1 || xWinHorizontal2 ||
                xWinHorizontal3 || xWinVertical1 ||
                xWinVertical2 || xWinVertical3) {
            System.out.println("X wins");
        } else if (oWinLeftDiagonal || oWinRightDiagonal ||
                oWinHorizontal1 || oWinHorizontal2 ||
                oWinHorizontal3 || oWinVertical1 ||
                oWinVertical2 || oWinVertical3) {
            System.out.println("O wins");
        }

        // Print draw
        // Draw means the sum of X and O is equal to 9, also no other win condition applies
        else if (X + O == 9) {
            System.out.println("Draw");
        }

        // Print game not finished
        else if (X + O < 9) {
            System.out.println("Game not finished");
        }
    }
}