package Inna.week07;

public class FindTheUnique {
    /*
    Write a return method that can find the unique characters from the String
    EX: unique("AAABBBCCCDEF")==>"DEF"
     */

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){ //if first occurrence = to last occurrence then add it to my String
                result += ch;
            }
        }
        return result;
    }
}
