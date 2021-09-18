package algorithms.misc;

public class MaximumSumIncreasingSubSequence {

    public static void main(String[] args) {

        int[] numbers = {1, 101, 2, 3, 100, 4, 5};
        int[] MIS = new int[numbers.length];
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            MIS[i]=numbers[i];
        }

        for(int i=1;i<numbers.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(numbers[i]>numbers[j] &&
                        MIS[i] < MIS[j]+numbers[i])
                {
                    MIS[i]=MIS[j]+numbers[i];
                }
            }

        }

        for(int i=0;i<numbers.length;i++)
            if(maxSum<MIS[i])
                maxSum=MIS[i];

        System.out.println("Maximum increasing subsequence sum = "+maxSum);
    }

}
