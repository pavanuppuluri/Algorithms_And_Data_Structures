package algorithms.bitwise;

// Program to swap adjacent bits (or) program to swap even and odd position bits
// Example - if input number = 10 (Binary representation = 1010)
// Now our program swap adjacent bits and resultant binary representation = 0101
// Output = 5

public class SwapAdjacentBits {
    public static void main(String[] args) {

        SwapAdjacentBits.swapAdjacentBits(9);
    }

    static void swapAdjacentBits(int number)
    {
        System.out.println("Input number is "+number);
        System.out.println("Binary representation of input number is "+
                String.format("%32s", Integer.toBinaryString(number)).replaceAll(" ", "0"));

        // First step is to extract all even bits
        // Why & with 0xAAAAAAAA? Because it has all even bits set
        int evenBits = number & 0xAAAAAAAA;

        // Next step is to extract all odd bits
        // Why & with 0xAAAAAAAA? Because it has all odd bits set
        int oddBits = number & 0x55555555;

        // Next step is to right shift eventBits
        evenBits = evenBits >> 1;

        // Next step is to left shift oddBits
        oddBits = oddBits << 1;

        // Now merge both to get the final result
        int swappedNumber = evenBits | oddBits;

        System.out.println("Swapped number is "+swappedNumber);
        System.out.println("Binary representation of input number is "+
                String.format("%32s", Integer.toBinaryString(swappedNumber)).replaceAll(" ", "0"));


    }
}
