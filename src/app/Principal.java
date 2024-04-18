package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	 public static void main(String[] args) {
	        // Crear un array de enteros con 5 números aleatorios del 1 al 10
	        int[] numeros = generarNumerosAleatorios(5, 1, 10);

	        // Array para almacenar resultados de Fibonacci
	        int[] resultadoFibonacci = new int[5];

	        // Array para almacenar resultados de factorial
	        int[] resultadoFactorial = new int[5];

	        // Array para almacenar resultados de si los números son primos o no
	        boolean[] resultadoPrimos = new boolean[5];

	        // Calcular Fibonacci, factorial y verificar si los números son primos
	        for (int i = 0; i < 5; i++) {
	            int numero = numeros[i];

	            // Calcular Fibonacci
	            resultadoFibonacci[i] = Algoritmos.fibonacci(numero);

	            // Calcular factorial
	            resultadoFactorial[i] = Algoritmos.factorial(numero);

	            // Verificar si es primo
	            resultadoPrimos[i] = Algoritmos.esPrimo(numero);
	        }
	    }

	    // Método para generar un array de 'n' números aleatorios en el rango [min, max]
	    private static int[] generarNumerosAleatorios(int n, int min, int max) {
	        int[] numeros = new int[n];
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            numeros[i] = random.nextInt(max - min + 1) + min;
	        }
	        return numeros;
	    }
}
