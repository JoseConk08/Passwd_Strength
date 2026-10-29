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

    // MediumPasswords

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
