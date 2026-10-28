
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        for(int i=0;i<n;i+=2){
            System.out.print(num[i]+" ");
        }
    }
}
