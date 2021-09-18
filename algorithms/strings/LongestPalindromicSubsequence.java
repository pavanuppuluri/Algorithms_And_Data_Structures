package algorithms.strings;

public class LongestPalindromicSubsequence
{
    public static void main(String[] args) {

        String str="abcefgcba";
        int n=str.length();
        int startIndex=-1;
        int maxLength=-1;

        int[][] T=new int[n][n];

        for(int i=0;i<n;i++)
        {
            T[i][i]=1;
        }

        for(int k=2;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;

                if(str.charAt(i)==str.charAt(j))
                {
                    T[i][j]=T[i+1][j-1]+2;
                }
                else
                {
                    T[i][j]=Math.max(T[i+1][j],T[i][j-1]);
                }
            }
        }

        System.out.println("Longest palindromic subsequence length = "+T[0][n-1]);

    }
}
