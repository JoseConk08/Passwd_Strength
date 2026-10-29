package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsLeapYearTest {

    @Test
    @DisplayName("2024 és de traspàs")
    void any2024_shouldReturnTrue() {
        // Arrange
        int year = 2024;
        boolean expected = true;

        // Act
        boolean actual = IsLeapYear.isLeapYear(year);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2023 no és de traspàs")
    void any2023_shouldReturnFalse() {
        // Arrange
        int year = 2023;
        boolean expected = false;

        // Act
        boolean actual = IsLeapYear.isLeapYear(year);

        // Assert
        assertEquals(expected, actual);
    }
}
