package algorithms.strings;

public class LongestPalindromicSubStringDP {
    public static void main(String[] args) {

        String str="forgeeksskeegfor";
        int n=str.length();
        int startIndex=-1;
        int maxLength=-1;

        boolean[][] T=new boolean[n][n];

        for(int i=0;i<n;i++)
        {
            T[i][i]=true;
        }

        for(int j=0;j<n-1;j++)
        {
            if(str.charAt(j)==str.charAt(j+1)) {
                T[j][j + 1] = true;
                startIndex=j;
                maxLength=2;
            }
        }

        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;

                if(str.charAt(i)==str.charAt(j) &&
                        T[i+1][j-1]==true)
                {
                    T[i][j]=true;
                    if(k>maxLength) {
                        startIndex = i;
                        maxLength = k;
                    }
                }
            }
        }

        System.out.println("Longest palindromic substring length = "+maxLength);
        System.out.println("Longest palindromic substring = "+str.substring(startIndex, startIndex+maxLength));
    }
}
