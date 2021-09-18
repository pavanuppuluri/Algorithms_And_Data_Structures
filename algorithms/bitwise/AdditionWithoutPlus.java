package algorithms.bitwise;


// Add 1 to a given number n with out +
// Approach
// If n=11 (1011) n+1=12 (1100)
// If n=7  (0111) n+1=8  (1000)
// If n=2  (0010) n+1=2  (0011)
// Oyr approach is -
// Flip all the set bits (1s) from left until we get a 0
// Now flip the right most 0 to 1

public class AdditionWithoutPlus {
    public static void main(String[] args) {

        int n=8;
        int m=1;

        while((n&m) >=1)
        {
            n=n^m;
            m=m<<1;
        }

        // Now flip the right most bit
        n=n^m;

        System.out.println(n);

    }
}
