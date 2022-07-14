import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args){
        System.out.print("EnterN: ");
        int N = new Scanner(System.in).nextInt();
        int count =0;
        for(int i =1;i<=N;i++){
            for(int k = 0; k < N-i; k++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print(count % 10 + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
