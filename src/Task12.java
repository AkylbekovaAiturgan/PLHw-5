import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        int petya = in.nextInt();
        int pos = n + 1;

        for (int i = 0; i < n; i++) {
            if (num[i] < petya) {
                pos = i + 1;
                break;
            }
        }

        System.out.println(pos);
    }
}