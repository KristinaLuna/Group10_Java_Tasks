package Sita.Week3;

public class SwapValues {


        // swap values of 2 int variables, without using third variable

        public static void swapNum(int num1, int num2){


            num2 = num1 + num2;
            num1 = num2 - num1;
            num2 = num2 - num1;

            System.out.println("Num1 = " + num1);
            System.out.println("Num2 = " + num2);


        }


        public static void main(String[] args) {

            swapNum(3, 8);



        }

    }


