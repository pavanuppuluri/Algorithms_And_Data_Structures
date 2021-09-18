package algorithms.bitwise;

// Given an integer X, multiply it with 3.5 without using
// *,/,% operators
// Approach
// X multiplied by 3.5 = 3.5X
// 3.5X can be represented as 2X+X+(X/2)
// We can get 2X by left shift X<<1
// We can get X/2 by right shift X>>1

public class MultiplyWithoutStartOperator {

    public static void main(String[] args) {
        int X=10;
        int result = (X<<1) + X + (X>>1);
        System.out.println(result);
    }
}
