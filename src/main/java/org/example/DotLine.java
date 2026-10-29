package org.example;

public class DotLine {

    public static String dotLine(int length) {
        if (length <= 0) return "";

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < length; i++) {
            line.append('.');
        }
        return line.toString();
    }
}
