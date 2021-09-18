package algorithms.strings;

// Reverse a string with out using temporary variable
public class ReverseStringNoTempVariable {

    public static void main(String[] args) {

        String str="Hi! Reverse This String";
        char[] charArray= str.toCharArray();
        int start=0;
        int end=str.length()-1;

        while(start<end)
        {
            charArray[start]= (char) (charArray[start]^charArray[end]);
            charArray[end]= (char) (charArray[start]^charArray[end]);
            charArray[start]= (char) (charArray[start]^charArray[end]);
            start++;
            end--;

        }

        System.out.println("Reversed string is "+String.valueOf(charArray));
    }



}
