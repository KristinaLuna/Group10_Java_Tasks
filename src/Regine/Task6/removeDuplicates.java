package Regine.Task6;

public class removeDuplicates {

    public static void main(String[] args) {
        System.out.println("AAABBBCCC");

        String name = "YEENNNNNAAAAAA";

        System.out.println("1st method: removeDuplicates og the word : AAABBBCCC = " + removeDuplicates("AAABBBCCC"));

        System.out.println("1st method: remove duplicated letters of " + name + " = " + removeDuplicates(name));

        System.out.println("2nd method: removeDups2 = " + removeDups2("AAABBBCCC"));




    }

    public static String removeDuplicates(String word) {
        StringBuilder noDuplicates = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (!noDuplicates.toString().contains(String.valueOf(ch))) {
                noDuplicates.append(ch);
                            //.append -> creates a new string
            }
        }
        return noDuplicates.toString();
    }

    public static String removeDups2(String word2) {
        if (word2.equals(word2 = word2.replaceAll("(.)\\1", "$1")))
                                                    // "(.)\\1", "$1" -> regex that replaces duplicates
            return word2;
        else
            return removeDups2(word2);
    }

    }



