package Zlata.week1;

public class OddOrEven {

        public static void oddOrEven1(int n) {
            if (n % 2 == 0) {
                System.out.println("Number " + n + " is even.");
            }else{
                System.out.println("Number " + n + " is odd.");
            }
        }
        public static void main(String[] args) {
            oddOrEven1(5);
            oddOrEven1(6);
        }
}
