package algorithms.bitwise;

public class BitsRotation {
    public static void main(String[] args) {
        int number=5;
        int rotationCount=1;

        leftRotate(number, rotationCount);
    }

    static void leftRotate(int number, int rotationCount)
    {

        int leftRotatedNumber = number<<rotationCount | number>>(32-rotationCount);
        System.out.printf("Result of left rotation of %d by %d times is %d",number,rotationCount,leftRotatedNumber);
    }
}
