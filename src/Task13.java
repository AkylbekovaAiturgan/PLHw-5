import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }

        for (int i = a - 1, j = b - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }

        for (int i = c - 1, j = d - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}