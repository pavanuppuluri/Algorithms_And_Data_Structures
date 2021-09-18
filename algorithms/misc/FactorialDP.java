package algorithms.misc;

public class FactorialDP {
    public static void main(String[] args) {

        int n=6;
        int[] factorial=new int[n+1];
        factorial[0]=1;

        for(int i=1;i<=n;i++)
        {
            factorial[i]=i*factorial[i-1];
        }

        System.out.println(factorial[n]);
    }
}
