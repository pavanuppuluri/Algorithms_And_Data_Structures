package algorithms.bitwise;

public class AddNumbersWithoutPlus {

    public static void main(String[] args) {

        int x = 18;
        int y = 30;

        // Approach 1
        System.out.println(x-(-y));

        // Approach 2
        while (y != 0)
        {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }

        System.out.println(x);

    }
}
