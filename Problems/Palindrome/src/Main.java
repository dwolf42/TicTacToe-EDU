import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String revert = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            revert += input.charAt(i);
        }

        System.out.println(input.equals(revert) ? "yes" : "no");
    }
}
