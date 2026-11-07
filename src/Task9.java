import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        if (n > 0) {
            int last = num[n - 1];
            for (int i = n - 1; i > 0; i--) {
                num[i] = num[i - 1];
            }
            num[0] = last;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}