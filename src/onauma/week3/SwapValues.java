package onauma.week3;

public class SwapValues {

    public static void main(String[] args) {

        // swap values of 2 int variables, without using third variable

        int n1 = 5;
        int n2 = 10;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        n2 = n2 + n1;
        n1 = n2 - n1;
        n2 = n2 - n1;

        System.out.println("After swapping : n1 = " + n1);
        System.out.println("After swapping : n2 = " + n2);

    }

}
