package weekly_tasks.week1;

public class OddOrEven {


    public static void OddOrEven1(int n) {
        if (n % 2 == 0) {
            System.out.println("Number " + n + " is even.");
        }else{
            System.out.println("Number " + n + " is odd.");
        }
    }
    public static void main(String[] args) {
        OddOrEven1(7);
        OddOrEven1(426);



    }
}
