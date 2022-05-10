/*
Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
 */

package exerciciosHoje;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		// inicializando a matriz
		int[][] matriz = new int[3][3];
		int contMaior10 = 0, linha, coluna;

		// Criando sistema de entrada de dados
		Scanner leia = new Scanner(System.in);

		// Passando pelas posições da matriz
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				// Contando e recebendo valores maiores que 10
				if (matriz[linha][coluna] > 10) {
					contMaior10++;
					System.out.println("Preencha um valor: ");
					matriz[linha][coluna] = leia.nextInt();
				}

				// Reecebendo valores que não são maior do que 10
				else {
					System.out.println("Preencha um valor");
					matriz[linha][coluna] = leia.nextInt();
				}
			}
		}
		// Mostrando valores maiores que 10
		System.out.println("numeros maiores que 10: " + contMaior10);
	}
}