import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//input
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int number1 = stdin.nextInt();
        System.out.println("Enter limit : ");
        int number2 = stdin.nextInt();

//        int big = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
////process
//        for (int a = 0; a < number; a++) {
//            System.out.println("Enter phan tu thu: " + (a + 1));
//            int ele = stdin.nextInt();
//
//            if (big < ele) {
//                big = ele;
//            }
//
//            if (small > ele) {
//                small = ele;
//            }
//
//        }
////Output
//        System.out.println("So lon nhat la: " + big);
//        System.out.println("So be nhat la: " + small);
        int sum = 0;
        int k = (number1 % 2 == 0) ? number1 : (number1 + 1);
        for (int a = k; a <= number2; a = a + 2) {
            sum += a;
        }
        System.out.println("SUm is: " + sum);
    }
}