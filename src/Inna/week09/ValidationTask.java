package Inna.week09;

public class ValidationTask {
    public static void main(String[] args) {
        System.out.println("validatePassword(\"12Sparta$4\") = " + validatePassword("12Sparta$4"));
        System.out.println("validatePassword(\"hgsjh kjg\") = " + validatePassword("hgsjh kjg"));


    }
    /*
    String -- Password Validation Task

    Write a return method that can verify if a password is valid or not.

    Requirements:

    Password MUST be at least have 6 characters and should not contain space

    Password should at least contain one upper case letter

    Password should at least contain one lowercase letter

    Password should at least contain one special character

    Password should at least contain a digit

    If all requirements above are met, the method returns true, otherwise returns false.
     */

    // string has 6 char and no space - str.length<6 || str. contains(" ")
    // string upper and lower - isUpperCase/ isLowerCase loop
    // specialChar isLetter, isDigit loop

    public static boolean validatePassword(String str) {

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;

        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }

        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                lowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                upperCase = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else  {
                specialChar = true;
            }

        }
        if(upperCase&&lowerCase&&specialChar&&digit){
            return true;
        }
        return false;
    }
}
