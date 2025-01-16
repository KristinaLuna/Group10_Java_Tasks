package onauma.week1;

public class OddOrEvenSolution {
    public static void main(String[] args) {

        // Solution is here!
        identify(1);
        identify(2);
        identify(3);
        identify(4);

    }

    public static void identify(int num){

        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

/*
    Write a method that can identify  a given number is even or odd.
    EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */
