package algorithms.bitwise;

// This program counts the number of set bits (1s) in
// binary representation of a given number

public class CountSetBits {

    public static void main(String[] args) {

        CountSetBits countSetBits=new CountSetBits();
        System.out.println(countSetBits.countSetBits(6)); // Output 2
        System.out.println(countSetBits.countSetBits(1)); // Output 1
        System.out.println(countSetBits.countSetBits(0)); // Output 0
        System.out.println(countSetBits.countSetBits(7)); // Output 3

    }

    int countSetBits(int number)
    {
        int numberOfSetBits=0;
        while(number>0)
        {
            numberOfSetBits=numberOfSetBits + (number&1);
            number=number>>1;
        }
        return numberOfSetBits;
    }
}
