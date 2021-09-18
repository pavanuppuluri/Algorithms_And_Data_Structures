package algorithms.misc;

//You are given coins of different denominations and a total amount of money amount. Write a
//function to compute the fewest number of coins that you need to make up that amount. If that
//amount of money cannot be made up by any combination of the coins, return -1.

import java.util.Arrays;

// Example
// Input : coins=[1,2,5] amount=11
// Output : 3 (5+5+1)
public class CoinChange {
    public static void main(String[] args) {

        int[] coins={1,2,5};
        int amount=11;
        int[] minCoins=new int[amount+1];
        Arrays.fill(minCoins, amount+1); //Ofcourse, we can keep Integer.MAX_VALUE also
        minCoins[0]=0;

        for(int i=0;i<=amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i)
                {
                    minCoins[i]=Math.min(minCoins[i], 1+minCoins[i-coins[j]]);
                }

            }
        }

        System.out.println("Minimum number of coins = "+minCoins[amount]);

    }
}
