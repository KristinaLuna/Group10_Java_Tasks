package Kristina.week3;

public class SwapValues {

    public static void swapValues(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        swapValues(9,7);
    }



}
