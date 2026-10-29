package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterVowelsTest {

    @Test
    @DisplayName("'Hola món' es queda sense vocals")
    void holaMon_shouldReturnTextWithoutVowels() {
        // Arrange
        String text = "Hola món";
        String expected = "Hl mn";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Només vocals retorna un text buit")
    void nomesVocals_shouldReturnEmptyString() {
        // Arrange
        String text = "aeiou";
        String expected = "";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Text sense vocals retorna el mateix text")
    void senseVocals_shouldReturnSameText() {
        // Arrange
        String text = "rhythm";
        String expected = "rhythm";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Les vocals en majúscula també s'eliminen")
    void vocalsMajuscules_shouldReturnTextWithoutVowels() {
        // Arrange
        String text = "AEIOU BCN";
        String expected = " BCN";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Les vocals accentuades també s'eliminen")
    void vocalsAccentuades_shouldReturnTextWithoutVowels() {
        // Arrange
        String text = "àéíóú ÀÉÍÓÚ";
        String expected = " ";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("La consonant ñ no es considera vocal")
    void consonantNy_shouldReturnSameText() {
        // Arrange
        String text = "ny";
        String expected = "ny";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Text buit retorna un text buit")
    void textBuit_shouldReturnEmptyString() {
        // Arrange
        String text = "";
        String expected = "";

        // Act
        String actual = FilterVowels.filterVowels(text);

        // Assert
        assertEquals(expected, actual);
    }
}
