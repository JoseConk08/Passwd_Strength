package org.example;

public class FilterVowels {

    private static final String VOWELS = "aeiouàáâäãåèéêëìíîïòóôöõùúûüýAEIOUÀÁÂÄÃÅÈÉÊËÌÍÎÏÒÓÔÖÕÙÚÛÜÝ";

    public static String filterVowels(String text) {
        if (text == null) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (VOWELS.indexOf(letter) == -1) {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
