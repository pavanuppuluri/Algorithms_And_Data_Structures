package algorithms.strings;

public class LongestPalindromicSubStringBruteForce {

    public static void main(String[] args) {
        LongestPalindromicSubStringBruteForce longestPalindromicSubString=new LongestPalindromicSubStringBruteForce();
        String str="abcdedcba";
        int length=str.length();
        int maxLength=0;
        String longestPalindrome="";

        for(int i=0;i<length;i++)
        {
            for(int j=i;j<length;j++)
            {
                if (isPalindrome(str,i,j)) {
                    if((j+1-i)>maxLength) {
                        maxLength = j + 1 - i;
                        longestPalindrome=str.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println("Max length is "+maxLength);
        System.out.println("Max length palindrome is "+longestPalindrome);
    }

static boolean isPalindrome(String str, int start, int end)
{
    while(start<end)
    {
        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
}
