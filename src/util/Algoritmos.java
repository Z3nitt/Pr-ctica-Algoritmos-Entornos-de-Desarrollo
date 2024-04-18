package util;

/**
 * Esta es una clase abstracta que contiene métodos estáticos para cálculos.
 */

public abstract class Algoritmos {
	/**
     * Calcula el número de Fibonacci para un número.
     *
     * @param numero, el número entero para el cual se desea calcular el número de Fibonacci.
     * @return El número de Fibonacci correspondiente al número dado.
     */
	
	public static int fibonacci(int numero) {
        if (numero <= 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
	/**
     * Calcula el factorial de un número.
     *
     * @param numero, el número entero no negativo para el cual se desea calcular el factorial.
     * @return El factorial del número dado.
     */
	public static int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
	/**
     * Verifica si un número es primo.
     *
     * @param numero, el número entero positivo para verificar si es primo.
     * @return true si el número es primo, o false si no es primo.
     */
	 public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        if (numero <= 3) {
	            return true;
	        }
	        if (numero % 2 == 0 || numero % 3 == 0) {
	            return false;
	        }
	        int i = 5;
	        while (i * i <= numero) {
	            if (numero % i == 0 || numero % (i + 2) == 0) {
	                return false;
	            }
	            i += 6;
	        }
	        return true;
	    }
	
	
	
	
}
