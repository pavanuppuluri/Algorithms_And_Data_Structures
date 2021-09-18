package algorithms.bitwise;

public class EvenOddCheck {
    public static void main(String[] args) {
        int n=19;

        if((n&1)>=1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
