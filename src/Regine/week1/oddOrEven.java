package Regine.week1;

public class oddOrEven {

    public static void main(String[] args)

        {
            oddOrEven(99);
        }


        public static void oddOrEven(int num){
            if (num % 2 == 0) {
                System.out.println(num + " = number is even");
            } else {
                System.out.println(num + " = number is odd");
            }
        }

    }
