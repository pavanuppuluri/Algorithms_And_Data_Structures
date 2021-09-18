package algorithms.bitwise;

public class LeastSignificantBit {
    public static void main(String[] args) {
        int n=16;
        int k=3;

        n=n>>(k-1);

        if((n&1)==1)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }

    }
}
