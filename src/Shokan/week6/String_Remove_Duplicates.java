package Shokan.week6;

public class String_Remove_Duplicates {

    public static String removeDup(String str) {
        String result = ""; // Start with an empty result
        for (int i = 0; i < str.length(); i++) { // Go through each letter one by one
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {   // If it's the first letter OR different from the last one
                result += str.charAt(i); // Add it to the result
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBBCCCCC")); // Output: ABC

    }
}

