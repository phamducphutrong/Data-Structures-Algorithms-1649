import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args)
    {
        int arr[] = {9,7,10,9,2,8,9,10,5, Integer.MAX_VALUE};
        System.out.print("Enter k: ");
        int k = new Scanner(System.in).nextInt();
        int bound = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++)
        {
            max = Utility.findMax(arr,bound);
            if(max == Integer.MIN_VALUE)
            {
                break;
            }
            bound = max-1;
        }
        System.out.println("The k_th largest value is: " + max);
    }
}
