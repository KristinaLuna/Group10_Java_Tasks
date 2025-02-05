package Regine.week4;

public class ReversedNumber {

    public static void main(String[] args) {
        int num = 21; // int that needs to be reversed
        int reversedNum = 0; // the variable to store the reversed number.

        while (num != 0) {                              // num should not be equal to 0
            int digit = num % 10;                       // extracting the last digit
            reversedNum = reversedNum * 10 + digit;     // building the reversed num
            num /= 10;                                  // removing the last digit from original number
        }
        System.out.println("The reversed of the given number is -->  " + reversedNum);
                    // once the loop ends, prints the reversed input
    }
}
