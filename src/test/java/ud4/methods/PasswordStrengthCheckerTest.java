package ud4.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ud4.methods.PasswordStrengthChecker.PasswordStrength;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("PasswordStrengthChecker")
class PasswordStrengthCheckerTest {

    // InvalidPasswords

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

    // MediumPasswords

    // StrongPasswords
}
