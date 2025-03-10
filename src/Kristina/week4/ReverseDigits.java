package Kristina.week4;

public class ReverseDigits {

    public static int reverseDigits(int num) {

        if (num >= 0) {
            return num;
        } else {
            int positiveNum = -(num);  //switch negative number to positive

            String newNumStr = "" + positiveNum; //turn the positive number into a string
            String reversedString = ""; //we are going to store a reversed string here

            for (int i = newNumStr.length() - 1; i >= 0; i--) {
                reversedString += newNumStr.charAt(i);
            }

            positiveNum = Integer.parseInt(reversedString); // flip the string back into an int
            num = -positiveNum; // make it a negative number

            return num;
        }
    }

    public static void main(String[] args) {

        System.out.println(reverseDigits(-95));
        System.out.println(reverseDigits(5555658));
        System.out.println(reverseDigits(-123456));
        System.out.println(reverseDigits(0));
    }


}




