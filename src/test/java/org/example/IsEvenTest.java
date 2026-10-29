package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsEvenTest {

    @Test
    @DisplayName("4 és parell")
    void quatre_shouldReturnTrue() {
        // Arrange
        int number = 4;
        boolean expected = true;

        // Act
        boolean actual = IsEven.isEven(number);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("7 és imparell")
    void set_shouldReturnFalse() {
        // Arrange
        int number = 7;
        boolean expected = false;

        // Act
        boolean actual = IsEven.isEven(number);

        // Assert
        assertEquals(expected, actual);
    }
}
