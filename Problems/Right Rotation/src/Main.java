import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringInputToArray = scanner.nextLine().split(" ");
        int times = scanner.nextInt() % stringInputToArray.length;
        String[] actualArray = shiftArrayTimes(stringInputToArray, times);
        printIt(actualArray);
    }

    public static String[] shiftArrayTimes(String[] arrayFromActualArray, int times) {
        for (int i = 0; i < times; i++) {
            shiftArrayToRight(arrayFromActualArray);
        }
        return arrayFromActualArray;
    }

    public static String[] shiftArrayToRight(String[] arrayFromShiftArrayTimes) {
        String saveLastIndex = arrayFromShiftArrayTimes[arrayFromShiftArrayTimes.length - 1];

        for (int i = arrayFromShiftArrayTimes.length - 2; i > -1; i--) {
            arrayFromShiftArrayTimes[i + 1] = arrayFromShiftArrayTimes[i];
        }
        arrayFromShiftArrayTimes[0] = saveLastIndex;
        return arrayFromShiftArrayTimes;
    }

    public static void printIt(String[] arrayFromRotatedArray) {
        for (String enorila : arrayFromRotatedArray) {
            System.out.print(enorila + " ");
        }
    }
}