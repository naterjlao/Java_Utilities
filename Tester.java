package util;

/**
 * Dedicated class for testing
 */
public class Tester {
    public static void main(String[] a) {
        int i = 0, numBits = 8;

        for (; i < 256; i++) {
            System.out.println(i + " = " + UtilityMethods.decimalToBinary(i, numBits));
        }
    }
}
