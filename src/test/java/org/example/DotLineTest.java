package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DotLineTest {

    @Test
    @DisplayName("Longitud 5 retorna 5 punts")
    void longitud5_shouldReturnFiveDots() {
        // Arrange
        int length = 5;
        String expected = ".....";

        // Act
        String actual = DotLine.dotLine(length);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Longitud 1 retorna un sol punt")
    void longitud1_shouldReturnOneDot() {
        // Arrange
        int length = 1;
        String expected = ".";

        // Act
        String actual = DotLine.dotLine(length);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Longitud 0 retorna una línia buida")
    void longitud0_shouldReturnEmptyString() {
        // Arrange
        int length = 0;
        String expected = "";

        // Act
        String actual = DotLine.dotLine(length);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Longitud negativa retorna una línia buida")
    void longitudNegativa_shouldReturnEmptyString() {
        // Arrange
        int length = -3;
        String expected = "";

        // Act
        String actual = DotLine.dotLine(length);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("La línia té tants punts com la longitud demanada")
    void longitud10_shouldReturnTenDots() {
        // Arrange
        int length = 10;

        // Act
        String actual = DotLine.dotLine(length);

        // Assert
        assertEquals(length, actual.length());
    }
}
