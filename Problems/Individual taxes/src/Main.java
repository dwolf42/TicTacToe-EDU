import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companies = scanner.nextInt();

        double[] income = new double[companies];
        double[] taxPercent = new double[companies];
        double[] taxToPay = new double[companies];

        for (int i = 0; i < income.length; i++) {
            income[i] = scanner.nextInt();
        }

        for (int j = 0; j < taxPercent.length; j++) {
            taxPercent[j] = scanner.nextInt();
        }

        for (int k = 0; k < taxToPay.length; k++) {
            taxToPay[k] = (taxPercent[k] * income[k]) / 100;
        }

        double maxTax = 0;
        int position = 0;

        for (int l = 0; l < taxToPay.length; l++) {
            if (taxToPay[l] > maxTax) {
                maxTax = taxToPay[l];
                position = l;
            }
        }
        System.out.println(position + 1);
    }
}
