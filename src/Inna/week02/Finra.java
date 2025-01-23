package Inna.week02;

public class Finra {
    public static void main(String[] args) {

        int n = 40;
        int number = 1;

      do {
          if (number % 3 == 0 && number % 5 == 0) {
              System.out.print("FINRA ");
          } else if (number % 5 == 0) {
              System.out.print("RA ");
          } else if (number % 3 == 0) {
              System.out.print("FIN ");
          } else {
              System.out.print(number + " ");
          }
          number++;

      } while (number <= n);

    }
}
//Write a program (using “do-while” loop) that generates and prints the FINRA
//pattern up to a given number.
//The FINRA pattern is a sequence of numbers where certain numbers are replaced with
//specific words. The pattern follows these rules:
//Numbers divisible by 3 are replaced with "FIN"
//Numbers divisible by 5 are replaced with "RA"
//Numbers divisible by both 3 and 5 are replaced with "FINRA"
//All other numbers remain unchanged
//Example:
//Input: 20
// Output:
// 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA