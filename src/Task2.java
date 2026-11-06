import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean first = true;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(num);
                first = false;
            }
        }
        System.out.println();
    }
}