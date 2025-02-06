package Zlata.Week4;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num) {
        if (num >= 0){
            System.out.println("Invalid number. Number should be negative.");
            return num;
            }

        int reversed = 0; //create a variable to store reversed number
        while (num < 0){
            int i = num%10; //find a last digit
            reversed = reversed*10 + i; //add to reverser variable
            num = num/10; //remove last digit
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(12));
        System.out.println(reverseNegativeNumber(-1356));
        System.out.println(reverseNegativeNumber(-1));
        System.out.println(reverseNegativeNumber(-350));
    }
}
