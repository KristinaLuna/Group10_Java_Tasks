package Inna.week3;

public class SwappingValues {
        public static void main(String[] args) {

            //Swap values of 2 int variables without using third variable.

            int n1 = 9;
            int n2 = 11;

            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);

            n2 = n2 + n1;
            n1 = n2 - n1;
            n2 = n2 - n1;

            System.out.println("n1 = " + n1);
            System.out.println("n2 =  " + n2);

        }

    }

