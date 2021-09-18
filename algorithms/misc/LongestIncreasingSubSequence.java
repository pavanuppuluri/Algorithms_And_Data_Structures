package algorithms.misc;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {

        int[] numbers = {1, 101, 2, 3, 100, 4, 5,101,102,103,104,111};
        int[] LIS = new int[numbers.length];
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            LIS[i]=1;
        }

        for(int i=1;i<numbers.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(numbers[i]>numbers[j] &&
                        LIS[i] < LIS[j]+1)
                {
                    LIS[i]=1+LIS[j];
                }
            }

        }

        for(int i=0;i<numbers.length;i++)
            if(maxSum<LIS[i])
                maxSum=LIS[i];

        System.out.println("Longest increasing subsequence sum = "+maxSum);
    }

}
