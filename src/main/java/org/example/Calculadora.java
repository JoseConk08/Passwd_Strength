package org.example;

/**
 * Ejemplo de clase de LÓGICA (lo que se llama "código de producción").
 * Esta clase NO contiene tests. Su única responsabilidad es hacer algo concreto.
 */
public class Calculadora {

    /**
     * Método que suma dos números.
     * Es "estático" para poder llamarlo sin crear objetos: Calculadora.suma(2, 3)
     */
    public static int suma(int a, int b) {
        return a + b;
    }
}
