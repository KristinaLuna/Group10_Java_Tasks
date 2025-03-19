package Inna.week08;

public class ReverseAString {

        public static void main(String[] args) {

            String original = "Hello World";
            String reversedStr = "";
            // post-decrement operator
            for (int i = original.length()-1; i >= 0; i--) { //for (initialization; condition; update)
                reversedStr += original.charAt(i);
            }
            System.out.println(reversedStr);



            StringBuilder reversedStr2 = new StringBuilder();

            for (int i = original.length()-1; i >= 0; i--) { //for (initialization; condition; update)
                char ch = original.charAt(i);
                reversedStr2.append(ch);
            }
            System.out.println(reversedStr2);
        }
    }

