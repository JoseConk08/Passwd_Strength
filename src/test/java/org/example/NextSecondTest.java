package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextSecondTest {

    @Test
    @DisplayName("10:15:30 -> 10:15:31")
    void migdiaMitja_shouldReturn101531() {
        // Arrange
        int hour = 10;
        int minute = 15;
        int second = 30;
        String expected = "10:15:31";

        // Act
        String actual = NextSecond.nextSecond(hour, minute, second);

        // Assert
        assertEquals(expected, actual);
    }
}
