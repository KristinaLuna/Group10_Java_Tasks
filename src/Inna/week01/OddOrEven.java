package Inna.week01;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(4);

    }

    public static void oddOrEven(int n){

        if(n%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.

EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

Create your branch, solve the question, push, create pull request and be ready to talk about your solution
 */