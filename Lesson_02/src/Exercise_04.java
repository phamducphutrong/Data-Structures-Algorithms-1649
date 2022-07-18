import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        //Given an array of N elements, print top k largest elements in the array
        int arr1[] = {9,7,10,9,2,8,9,10,5};
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = i + 1; j < arr1.length; j++)
            {
                int temp;
                if(arr1[i] < arr1[j])
                {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt();

    }
}