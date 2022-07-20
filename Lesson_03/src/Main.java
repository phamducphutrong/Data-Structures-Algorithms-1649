public class Main {
    public static void main(String[] args)
    {
        int N = 101;
        //Cach 1: Equation
        int result = N * (N + 1) / 2;
        System.out.println("C1 - Result = " + result);

        //Cach 2: Iteration
        result = 0;
        for  (int i = 1; i <= N; i++)
        {
            result = result + i;
        }
        System.out.println("C2 - Result = " + result);

        //Cach 3: Recursion
        result = sum(N);
        System.out.println("C3 - Result = " + result);
    }

    private static int sum(int n)
    {
        if (n==1) return 1;
        return sum(n-1) + n;
    }
}