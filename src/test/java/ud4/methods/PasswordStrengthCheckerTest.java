package ud4.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ud4.methods.PasswordStrengthChecker.PasswordStrength;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("PasswordStrengthChecker")
class PasswordStrengthCheckerTest {

    // InvalidPasswords

    // WeakPasswords

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

    // StrongPasswords
}
