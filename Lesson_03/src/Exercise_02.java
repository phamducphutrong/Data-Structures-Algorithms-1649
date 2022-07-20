public class Exercise_02
{
    public static void main(String[] args)
    {
        int array[] = {1,5,2,7,9,15,12};
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = array.length - 1;
//        System.out.println(maximunValueOfArray(array, max, end));
        System.out.println(f(array,start,end,max));`
//        System.out.println(pow(2,3));
    }

    //Function made by Phu Trong
    private static int pow(int x, int y)
    {
        if(y == 0) return 1;
        return pow(x, (y-1)) * x;
    }

    //Function made by Tung
    private static int maximunValueOfArray(int[] array, int max, int end)
    {
        if(end == -1) return max;
        if(max < array[end])
        {
            max = array[end];
            return maximunValueOfArray(array, max, end - 1);
        }
        else return maximunValueOfArray(array, max, end - 1);
    }

    //Function made by Teacher
    private static int f(int[] arr, int start, int end, int max)
    {
        if (end == start)
            return arr[start];
        else
        {
            max = f(arr,start,end - 1, max);
            if(max < arr[end]) max = arr[end];
            return max;
        }
    }
}