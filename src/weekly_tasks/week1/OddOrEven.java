package weekly_tasks.week1;

public class OddOrEven {


    public static int OddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Number " + n + " is even.");
        }else{
            System.out.println("Number " + n + " is odd.");
        }
        return n;
    }
    public static void main(String[] args) {
        OddOrEven(7);
        OddOrEven(426);



    }
}
