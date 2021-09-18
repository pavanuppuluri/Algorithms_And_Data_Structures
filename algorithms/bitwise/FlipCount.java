package algorithms.bitwise;

/* Calculate number of bits to be flipped to make a number n1 to number n2
   Ex: n1=10,n2=12
   Means n1=1010, n2=1100
   Now we need to flip 2 bits to make n1=n2

   Approach is first perform n1 XOR n2
   It gives the number of different bits
   After that calculate number of set bits in n1 XOR n2
 */

public class FlipCount {

    public static void main(String[] args) {

        int n1=15;
        int n2=16;

        // Get XOR
        int xorResult = n1^n2;

        //Now count set bits
        int setBitsCount=0;
        while(xorResult>0)
        {
           setBitsCount+=xorResult&1;
           xorResult=xorResult>>1;
        }

        System.out.println(setBitsCount);

    }
}
