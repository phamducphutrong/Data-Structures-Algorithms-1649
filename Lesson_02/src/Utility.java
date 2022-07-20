public class Utility {
    public static int findMax(int arr[], int upper_bound)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= upper_bound && max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findPow(int x, int y)
    {
        int pow = 1;
        for(int i = 0; i < y; i++)
        {
            if(y == 0)
            {
                return 1;
            }
            pow = pow * x;

        }
        return pow;
    }
//    public static int findRound(double x)
//    {
//        int result = 0;
//        if(x % 1 >= 0.5)
//        {
//            result = (int)x + 1;
//        }
//        else if(x % 1 < 0.5)
//        {
//            result = (int)x;
//        }
//        return result;
//    }
    public static double findRound(double x, int k)
    {
        int m = findPow(10,k);
        return (int)(x*m+0.5)*1.0/m;
    }
}