import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = num[i];
            num[i] = num[n - 1 - i];
            num[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}