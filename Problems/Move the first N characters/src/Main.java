import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        String[] oldArray = s.split("");

        if (n == oldArray.length || n == 0 || n > oldArray.length) {
            System.out.println(s);
        } else {
            String[] newArray = new String[oldArray.length];

            // copy first n elements to the end of the new array
            for (int i = 0; i < n; i++) {
                newArray[oldArray.length - n + i] = oldArray[i];
            }
            // copy elements past n to the beginning of the new array
            for (int j = 0; j < oldArray.length - n; j++) {
                newArray[j] = oldArray[n + j];
            }
            // print the new array
            System.out.println(String.join("", newArray));
        }
    }
}