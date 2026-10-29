package ud4.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ud4.methods.PasswordStrengthChecker.PasswordStrength;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("PasswordStrengthChecker")
class PasswordStrengthCheckerTest {

    @Nested
    @DisplayName("Contrasenyes invàlides")
    class InvalidPasswords {

        @Test
        @DisplayName("Una contrasenya nul·la és invàlida")
        void nullPassword_shouldReturnInvalid() {
            // Arrange
            String password = null;
            PasswordStrength expected = PasswordStrength.INVALID;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Una contrasenya buida és invàlida")
        void emptyPassword_shouldReturnInvalid() {
            // Arrange
            String password = "";
            PasswordStrength expected = PasswordStrength.INVALID;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Una contrasenya de 7 caràcters és invàlida")
        void sevenCharacters_shouldReturnInvalid() {
            // Arrange
            String password = "Abcde1!";
            PasswordStrength expected = PasswordStrength.INVALID;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Una contrasenya forta massa curta és invàlida")
        void strongButTooShort_shouldReturnInvalid() {
            // Arrange
            String password = "Ab1!";
            PasswordStrength expected = PasswordStrength.INVALID;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Nested
    @DisplayName("Contrasenyes febles")
    class WeakPasswords {

        @Test
        @DisplayName("Només minúscules és feble")
        void onlyLowercase_shouldReturnWeak() {
            // Arrange
            String password = "abcdefgh";
            PasswordStrength expected = PasswordStrength.WEAK;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Només majúscules és feble")
        void onlyUppercase_shouldReturnWeak() {
            // Arrange
            String password = "ABCDEFGH";
            PasswordStrength expected = PasswordStrength.WEAK;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Només símbols és feble")
        void onlySymbols_shouldReturnWeak() {
            // Arrange
            String password = "!!!!!!!!";
            PasswordStrength expected = PasswordStrength.WEAK;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Minúscules i dígits és feble")
        void lowercaseAndDigits_shouldReturnWeak() {
            // Arrange
            String password = "abcdef12";
            PasswordStrength expected = PasswordStrength.WEAK;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Nested
    @DisplayName("Contrasenyes mitjanes")
    class MediumPasswords {

        @Test
        @DisplayName("Minúscules i majúscules és mitjana")
        void lowercaseAndUppercase_shouldReturnMedium() {
            // Arrange
            String password = "Abcdefgh";
            PasswordStrength expected = PasswordStrength.MEDIUM;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Minúscules i símbols és mitjana")
        void lowercaseAndSymbols_shouldReturnMedium() {
            // Arrange
            String password = "abcdefg!";
            PasswordStrength expected = PasswordStrength.MEDIUM;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Majúscules i símbols és mitjana")
        void uppercaseAndSymbols_shouldReturnMedium() {
            // Arrange
            String password = "ABCDEFG!";
            PasswordStrength expected = PasswordStrength.MEDIUM;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Nested
    @DisplayName("Contrasenyes fortes")
    class StrongPasswords {

        @Test
        @DisplayName("Minúscules, majúscules i símbols és forta")
        void allTypes_shouldReturnStrong() {
            // Arrange
            String password = "Abcdefg!";
            PasswordStrength expected = PasswordStrength.STRONG;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Una contrasenya forta amb dígits és forta")
        void allTypesWithDigits_shouldReturnStrong() {
            // Arrange
            String password = "A!bC3dEf";
            PasswordStrength expected = PasswordStrength.STRONG;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Una contrasenya de 8 caràcters amb tots els tipus és forta")
        void eightCharactersAllTypes_shouldReturnStrong() {
            // Arrange
            String password = "aB3!defg";
            PasswordStrength expected = PasswordStrength.STRONG;

            // Act
            PasswordStrength actual = PasswordStrengthChecker.checkStrength(password);

            // Assert
            assertEquals(expected, actual);
        }
    }
}
