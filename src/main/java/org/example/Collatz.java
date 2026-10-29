package org.example;

public class Collatz {

    public static int collatz(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be a positive integer");

        long value = n;
        int iterations = 0;
        while (value != 1) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = 3 * value + 1;
            }
            iterations++;
        }
        return iterations;
    }
}
