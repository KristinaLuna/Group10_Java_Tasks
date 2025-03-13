package Regine.Week7;

public class unique {
    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));

    }

    public static String unique(String word) {
        String result = " ";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (word.indexOf(ch) == word.lastIndexOf(ch)){
                result += ch;
            }
        }
        return result;
    }
}
