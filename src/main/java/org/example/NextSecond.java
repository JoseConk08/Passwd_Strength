package org.example;

public class NextSecond {

    public static String nextSecond(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second > 59) throw new IllegalArgumentException("second must be 0-59");

        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) hour = 0;
            }
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
