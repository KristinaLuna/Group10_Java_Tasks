package Shokan.week4;

public class ReverseANegativeNumber {

    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static int reverseNegative(int num) {
        // Ensure the number is negative
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number");
        }

        // Convert to positive for easy reversal, then reverse
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(-num)).reverse().toString());

        // Return the reversed number with a negative sign
        return -reversed;
    }

    public static void main(String[] args) {
        int num = -35;
        System.out.println("Reversed: " + reverseNegative(num)); // Output: -53
    }
}



