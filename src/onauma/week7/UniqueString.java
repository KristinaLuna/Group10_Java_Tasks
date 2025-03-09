package onauma.week7;

public class UniqueString {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String str) {
        String result = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }
        return result;
    }
}

/*

String -- Find the unique

Write a return method that can find the unique characters from the String
EX: unique("AAABBBCCCDEF") ==> "DEF"
 */