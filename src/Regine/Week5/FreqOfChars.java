package Regine.Week5;

public class FreqOfChars {
    public static void main(String[] args) {

        String str = "AAAMMEEEERRRRRIIIICCCCCCAAAAAAAAAA";            // given string

        //2 loops
        // first Loop goes through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char charOfString = str.charAt(i);      // stores each char
            int count = 0;                          // stores number of occurrences

            //second loop Count occurrences of character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == charOfString) {
                    count++;
                }
            }

            // Print the character and its frequency, and avoid counting again
            if (count > 0) {
                System.out.print(" " + charOfString + "" + count);

                // Remove all occurrences of the character to prevent re-counting
                str = str.replaceAll(String.valueOf(charOfString), "");
            }
        }
    }
}
