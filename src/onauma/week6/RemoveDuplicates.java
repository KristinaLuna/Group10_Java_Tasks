package onauma.week6;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);

            if (result.contains(ch)){      // check if the result contain this character or not
                continue;                  // skip the remaining code and move to the next iteration
            }
            result += ch;
        }
        return result;
    }
}

/*

String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
EX: removeDup("AAABBBCCC") ==> ABC

 */