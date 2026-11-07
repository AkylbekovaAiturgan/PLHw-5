import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (num[i] != num[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}