package algorithms.misc;

/*
Input:

value = [ 20, 5, 10, 40, 15, 25 ]
weight = [ 1, 2, 3, 8, 7, 4 ]
int W = 10

Output: Knapsack value is 60

value = 20 + 40 = 60
weight = 1 + 8 = 9 < W

 */
public class Knapsack01Problem {
    public static void main(String[] args)
    {
        int[] values = {20, 5, 10, 40, 15, 25};
        int[] weights = { 1, 2, 3, 8, 7, 4};
        int maxWeight=10;

        Knapsack01Problem knapsack01Problem=new Knapsack01Problem();
        int result = knapsack01Problem.knapSack(weights,values,maxWeight,weights.length);
        System.out.println(result);
    }

    int knapSack(int[] weights, int[] values, int maxWeight, int n)
    {

        // Base case
        if(n==0 || maxWeight<=0)
            return 0;

        if(weights[n-1]>maxWeight)
        {
            return knapSack(weights,values,maxWeight,n-1);
        }

        return Math.max(
                values[n-1]+knapSack(weights,values,maxWeight-weights[n-1],n-1),
                knapSack(weights,values,maxWeight,n-1));

    }
}
