package Shokan.week5;

public class FrequencyOfCharacters {

    /*Write a return method that can find the frequency of characters in String
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static String FrequencyOfChars(String inputString) {
        String result = "";  // This will hold the final result

        // Go through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char charAt = inputString.charAt(i);  // Get the character at position i

            // Check if this character is already in the result string
            if (result.indexOf(charAt) == -1) {
                int count = 0;

                // Count how many times this character appears in the string
                for (int j = 0; j < inputString.length(); j++) {
                    if (inputString.charAt(j) == charAt) {
                        count++;
                    }
                }

                // Add the character and its count to the result string
                result += charAt + Integer.toString(count);
            }
        }

        return result;  // Return the final result
    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
    }

}
