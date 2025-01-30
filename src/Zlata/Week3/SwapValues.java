package Zlata.Week3;

public class SwapValues {
    public static void main(String[] args) {

        int a=10, b=45;
        System.out.println("Original number a = " + a);
        System.out.println("Original number b = " + b);

        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("Swapped number a = " + a);
        System.out.println("Swapped number b = " + b);
    }
}
