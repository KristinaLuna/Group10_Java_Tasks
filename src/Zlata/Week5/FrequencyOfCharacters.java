package Zlata.Week5;

public class FrequencyOfCharacters {
    public static String frequencyOfCharacters(String inputStr) {
        String result = ""; //to store a result of method

        while(!inputStr.isEmpty()) { //iterates till inputlStr reach 0 characters
            char ch = inputStr.charAt(0); //retrieves the first char
            int count = inputStr.length() - inputStr.replace(String.valueOf(ch), "").length();  //calculate number of same ch characters in inputStr
            result = result + ch + count; //to result adds ch and number of ch
            inputStr = inputStr.replace(String.valueOf(ch), ""); //removes all ch from inputStr
        }
        return result; //Returns the final result
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD")); //Output A3B2C1D2
        System.out.println(frequencyOfCharacters("ZZZZLLLATIKKKk")); //Output Z4L3A1T1I1K3k1
    }
}
