package Kristina.week1;


public class OddAndEven {

        //Write  a method which can identify that a  given number is even or odd
        //solution

    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(2);
    }



}
