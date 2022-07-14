
import java.lang.Math;
import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        System.out.print("Enter an positive integer number:");
        int N = new Scanner(System.in).nextInt();
        int N1 = 0;
        int a;
        while (N > 0) {
            a = N % 10;
            N1 = N1 * 10 + a;
            N = N / 10;
        }
        System.out.println("N' = " + N1);
        System.out.println("SQRT of N' is: " + Math.sqrt(N1));
    }
}