package Inna.week06;

public class StringRemoveDuplicates {
    //write a return method that can remove the duplicates values from String

    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");
    }

    public static void removeDuplicates(String str){
        String result = "";

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(String.valueOf(ch))){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
