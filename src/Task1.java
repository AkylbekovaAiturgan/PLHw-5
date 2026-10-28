import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        System.out.println();
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < n; i += 2) {
            System.out.print(num[i] + " ");
            {
            }
        }
    }
}
