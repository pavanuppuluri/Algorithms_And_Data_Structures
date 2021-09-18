package algorithms.misc;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.fibonacciRecur(9));
        System.out.println(fibonacci.fibonacciDP(9));
    }

    // Recursive - Bruteforce approach
    int fibonacciRecur(int n)
    {
        if(n<=1)
            return n;

        return fibonacciRecur(n-1)+fibonacciRecur(n-2);
    }

    int fibonacciDP(int n)
    {
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }

        return fib[n];

    }
}
