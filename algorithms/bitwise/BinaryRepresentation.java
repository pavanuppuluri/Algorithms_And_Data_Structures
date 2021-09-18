package algorithms.bitwise;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int number=12;

        // Binary Representation - Approach 1
        System.out.println("Binary representation = "+Integer.toBinaryString(12));

        // Binary Representation - Approach 2
        String binaryNumber="";
        while(number>0)
        {
            binaryNumber=(number%2)+binaryNumber;
            number=number/2;
        }

        System.out.println("Binary representation = "+binaryNumber);
    }
}
