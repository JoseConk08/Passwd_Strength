package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de TESTS.
 * Su única responsabilidad es COMPROBAR que Calculadora funciona bien.
 * Es como un examen: la clase Calculadora es el alumno y esta clase hace las preguntas.
 */
class CalculadoraTest {

    /**
     * @Test le dice a JUnit: "este método es una prueba, ejecútalo".
     * Sin esta anotación, JUnit lo ignora.
     */
    @Test
    @DisplayName("Suma dos números positivos") // Nombre legible que se ve al ejecutar
    void sumaPositivos() {

        // 1. ARRANGE (Preparar): creamos los datos de entrada y lo que esperamos
        int a = 2;
        int b = 3;
        int expected = 5; // lo que DEBERÍA pasar si el código es correcto

        // 2. ACT (Actuar): llamamos al método que queremos probar
        int actual = Calculadora.suma(a, b);

        // 3. ASSERT (Comprobar): comparamos lo esperado con lo real
        // Si no coinciden, el test FALLA (en rojo) y JUnit avisa
        assertEquals(expected, actual);
    }
}
