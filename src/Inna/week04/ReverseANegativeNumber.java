package Inna.week04;

public class ReverseANegativeNumber {
    /*
    reverseANegativeNumber
//Write a return method that can reverse digits of a negative number and return it as int
 //input: -35  output: -53
     */

    public static void main(String[] args) {

        int number = -35;
        int reversed = 0;

        int num = -number; //converted number to positive

        while (num > 0){
            reversed = reversed * 10 + num % 10; //  0 * 10 + 35 % 10 = 5 extracted last digit and add to reverse
            num = num /10; //removes the last digit and adds it to reverse the next loop cycle
        }
        System.out.println(-reversed); //reapplied negative sign to make it negative




    }


}
