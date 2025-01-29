package Shokan.week3;

public class SwapValues {

        public static void main(String[] args) {
            int a = 10, b = 20;

            System.out.println("Before swap: a = " + a + ", b = " + b);

            a = a + b;  // a = 10 + 20 = 30
            b = a - b;  // b = 30 - 20 = 10
            a = a - b;  // a = 30 - 10 = 20

            System.out.println("After swap: a = " + a + ", b = " + b);
        }
    }


