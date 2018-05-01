package util;

/**
 * This is a utility class used for defining static methods that can be used by various classes in the project.
 *
 * @author Nathaniel Lao
 */
public class UtilityMethods {
    /**
     * This will create an exception and generate a stack trace. From this trace, the method finds the method name of
     * the method calling this method. Therefore, whenever this method is called, it returns the method name of the
     * caller. This can be used to get the string of the method for use in an exception throw.
     * @return A String representation of the calling method. Format: "methodName()"
     */
    public static String getMethodName() {
        return (new Exception().getStackTrace()[1].getMethodName() + "()");
    }

    /**
     * This will create an exception and generate a stack trace. From this trace, the method finds the method name of
     * the method calling this method. Therefore, whenever this method is called, it returns the method name of the
     * caller. This can be used to get the string of the method for use in an exception throw.
     * @return A String representation of the calling method. Format: "methodName()"
     */
    public static String getMethodName(int stacks) {
        if (stacks > 0) {
            return (new Exception().getStackTrace()[stacks].getMethodName() + "()");
        } else {
            return "";
        }
    }

    /**
     * Returns true if the integer is even. In other words, divisible by 2.
     * @param n the integer in question.
     * @return true if the integer is even.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns true if the integer is odd. In other words, not divisible by 2.
     * @param n the integer in question.
     * @return true if the integer is odd.
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    /**
     * Returns the index of the parent of specified index in a binary tree. If the index is odd (i.e. a left child),
     * the following equation is used: parent_index = (current_index - 1) / 2. If the index is even (i.e. a right child),
     * the followwing equation is used parent_index = (current_index - 2) / 2.
     *
     * @throws IllegalArgumentException if the current index is less than or equal to zero.
     * @param current the index of the current Node.
     * @return The index of the parent Node.
     */
    public static int getParentIndex(int current) {
        if (current < 0) {
            throw new IllegalArgumentException(UtilityMethods.getMethodName() + ": index cannot be negative");
        } else if (current == 0) {
            throw new IllegalArgumentException(UtilityMethods.getMethodName() + ": index 0 does not have a parent because it is the root");
        } else if (isOdd(current)) {
            return (current - 1) / 2;
        } else {
            return (current - 2) / 2;
        }
    }

    public static int getLeftIndex(int current) {
        if (current < 0) {
            throw new IllegalArgumentException(UtilityMethods.getMethodName() + ": index cannot be negative");
        } else {
            return current * 2 + 1;
        }
    }

    public static int getRightIndex(int current) {
        if (current < 0) {
            throw new IllegalArgumentException(UtilityMethods.getMethodName() + ": index cannot be negative");
        } else {
            return current * 2 + 2;
        }
    }

    public static String decimalToBinary(int decimal, int numBits) {
        StringBuffer buffer = new StringBuffer();

        while(--numBits >= 0) {
            buffer.append((decimal >> numBits) % 2);
        }

        return buffer.toString();
    }

    public static void printPass() {
        System.out.println((new Exception().getStackTrace()[1].getMethodName() + "()") + " PASS");
    }

    public static void printPass(String description) {
        System.out.println((new Exception().getStackTrace()[1].getMethodName() + "()") + " PASS: " + description);
    }
}
