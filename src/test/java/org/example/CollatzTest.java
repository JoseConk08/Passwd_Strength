package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzTest {

    @Test
    @DisplayName("1 ja és 1, així que fa 0 iteracions")
    void un_shouldReturnZero() {
        // Arrange
        int n = 1;
        int expected = 0;

        // Act
        int actual = Collatz.collatz(n);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5 arriba a 1 en 5 iteracions")
    void cinc_shouldReturnFive() {
        // Arrange
        int n = 5;
        int expected = 5;

        // Act
        int actual = Collatz.collatz(n);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("8 arriba a 1 en 3 iteracions")
    void vuit_shouldReturnThree() {
        // Arrange
        int n = 8;
        int expected = 3;

        // Act
        int actual = Collatz.collatz(n);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("11 arriba a 1 en 14 iteracions")
    void onze_shouldReturnFourteen() {
        // Arrange
        int n = 11;
        int expected = 14;

        // Act
        int actual = Collatz.collatz(n);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("27 arriba a 1 en 111 iteracions")
    void vint_i_set_shouldReturn111() {
        // Arrange
        int n = 27;
        int expected = 111;

        // Act
        int actual = Collatz.collatz(n);

        // Assert
        assertEquals(expected, actual);
    }
}
