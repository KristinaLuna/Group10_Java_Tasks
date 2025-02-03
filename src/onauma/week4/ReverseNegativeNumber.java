package onauma.week4;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int n = -35;
        System.out.println("Original number : " + n);
        System.out.println("Reverse number : " + reverseNegativeNumber(n));
    }

    public static int reverseNegativeNumber(int num) {

        int reverse = 0;

        while (num < 0){
            int digit = num % 10;              //To get the last digit of number by using remainder by 10
            reverse = reverse * 10 + digit;
            num = num / 10;                    //Remove the last digit from the original number using division

        }

        return reverse;

        }
}

//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
