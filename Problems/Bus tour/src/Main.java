import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner luvos = new Scanner(System.in);

        int height = luvos.nextInt();
        int[] bridges = new int[luvos.nextInt()];
        int crash = 0;

        for (int i = 0; i < bridges.length; i++) {
            bridges[i] = luvos.nextInt();
            if (bridges[i] <= height) {
                crash = i + 1;
                break;
            }
        }
        System.out.println(crash > 0 ? "Will crash on bridge " + crash : "Will not crash");
    }
}