import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int indexOnSave = 0;
        int sequenceToPrint = 0;

        int[] arrayForInput = new int[defineLength];
        int[] saveLongestSequence = new int[defineLength];

        Arrays.fill(saveLongestSequence, 1);

        for (int i = 0; i < arrayForInput.length; i++) {
            arrayForInput[i] = scanner.nextInt();
        }

        for (int k = 1; k < arrayForInput.length; k++) {

            if (arrayForInput[k] > arrayForInput[k - 1]) {
                saveLongestSequence[indexOnSave]++;
            } else {
                indexOnSave++;
            }
        }

        for (int l = 0; l < saveLongestSequence.length; l++) {

            if (saveLongestSequence[l] > sequenceToPrint) {
                sequenceToPrint = saveLongestSequence[l];
            }
        }

        System.out.println(sequenceToPrint);
    }
}