import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i += 2) {
            int temp = num[i];
            num[i] = num[i + 1];
            num[i + 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}