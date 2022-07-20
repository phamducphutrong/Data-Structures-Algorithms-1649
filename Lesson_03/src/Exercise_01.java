public class Exercise_01
{
    public static void main(String[] args)
    {
        int a = 1501;
        int b = 2282;
        int start = (a % 2 == 0) ? a : (a + 1);
        int end = (b % 2 == 0) ? b : (b - 1);
        int result = sum(start, end);
        System.out.println(result);
//        System.out.println(sumOfEvenNumberFromAtoB(start,end));
    }
    /*private static int sumOfEvenNumberFromAtoB(int a, int b)
    {
        if (a % 2 == 0 && b % 2 == 0)
        {
            if (a == b) return b;
        }
        else if (a % 2 != 0 && b % 2 == 0)
        {
            a = a + 1;
            if ( a == b ) return b;
        }
        else if (a % 2 == 0 && b % 2 != 0)
        {
            b = b -1;
            if ( a == b) return b;
        }
        else if (a % 2 != 0 && b % 2 != 0)
        {
            a = a + 1;
            b= b - 1;
            if (a == b) return b;
        }
        return sumOfEvenNumberFromAtoB(a + 2, b) + a;
    }*/
    private static int sum(int start, int end)
    {
        if(end == start) return start;
        return sum(start, end - 2) + end;
    }
}
