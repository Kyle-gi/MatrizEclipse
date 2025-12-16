package org.sergiolozanoprofe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce filas:");
		int filas = sc.nextInt();
		System.out.println("Introduce columnas:");
		int columnas = sc.nextInt();

		int[][] matriz = new int[filas][columnas];

		// Rellenar la matriz con números consecutivos
		int contador = 1;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = contador++;
			}
		}

		// Mostrar la matriz creada
		mostrarMatriz( matriz, filas, columnas);

		// Invertir cada fila
		invertirMatriz(matriz, filas, columnas);

		// Mostrar la matriz invertida
		System.out.println("Mostrar Matriz Invertida:")
		mostrarMatriz(matriz, filas, columnas);

		sc.close();
	}

	private static void invertirMatriz(int[][] matriz, int filas, int columnas) {
		for (int i = 0; i < filas; i++) {
			int left = 0;
			int right = columnas;

			while (left < right) {
				int temp = matriz[i][left];
				matriz[i][left] = matriz[i][right];
				matriz[i][right] = temp;

				left++;
				right--;
			}
		}
	}

	private static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
		System.out.println("Matriz creada:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

