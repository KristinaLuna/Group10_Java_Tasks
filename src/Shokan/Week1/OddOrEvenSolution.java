package Shokan.Week1;

public class OddOrEvenSolution {

    public static void main(String[] args) {

        oddOrEven(13);
    }
    public static void oddOrEven(int num){
        if (num % 2 == 0) {
            System.out.println(num + " = number is even");
        } else {
            System.out.println(num + " = number is odd");
        }
    }
}

