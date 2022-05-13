/*
Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 

Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado
da adição da constante deve ser armazenado na própria matriz.

 */
package Array;

import java.util.Scanner;

public class Matriz_2 {

	public static void main(String[] args) {

		// Criando matriz 1, 2 e 3
		float[][] matriz = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];

		int linha, coluna, op;
		float constante;

		// Criando sistema de entrada de dados
		Scanner leia = new Scanner(System.in);

		// Preenchendo matriz 1 e 2
		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("Preencha um valor: ");
				matriz[linha][coluna] = leia.nextFloat();
				System.out.println("Preencha um valor: ");
				matriz2[linha][coluna] = leia.nextFloat();
			}
		}
		
		//Criando um menu 
		do {

			// Criando menu
			System.out.println("\n(1) somar as duas matrizes \r\n" + "(2) subtrair a primeira matriz da segunda \r\n"
					+ "(3) adicionar uma constante as duas matrizes\r\n" + "(4) imprimir as matrizes " + "\n(5) Sair");
			
			//Recebendo opção do menu
			op = leia.nextInt();

			// Somando matrizes
			if (op == 1) {
				System.out.println("\nSoma das matrizes: ");
				for (linha = 0; linha < 2; linha++) {
					System.out.println("");
					for (coluna = 0; coluna < 2; coluna++) {
						matriz3[linha][coluna] = matriz[linha][coluna] + matriz2[linha][coluna];
						System.out.print(matriz3[linha][coluna]+" ");
					}
				}
				System.out.println("");
			}

			// Subtraindo Matrizes
			else if (op == 2) {
				System.out.println("\nDiferença das matrizes: ");
				for (linha = 0; linha < 2; linha++) {
					System.out.println("");
					for (coluna = 0; coluna < 2; coluna++) {
						matriz3[linha][coluna] = matriz2[linha][coluna]- matriz[linha][coluna];
						System.out.print(matriz3[linha][coluna]+" ");
					}
				}
				System.out.println("");
			}

			// Adicionar constante as matrizes
			else if (op == 3) {

				// Recebendo o valor da constante
				System.out.println("Digite a constante que deseja adicionar: ");
				constante = leia.nextInt();

				// Adicionandoo constante a matriz 1 e 2
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						matriz[linha][coluna] += constante;
						matriz2[linha][coluna] += constante;
					}
				}
			}

			// Exibindo as matrizes
			else if (op == 4) {

				// Exibindo primeira matriz
				for (linha = 0; linha < 2; linha++) {
					System.out.println("\n");
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.print(matriz[linha][coluna] + " ");
					}
				}

				// Exibindo segunda matriz
				System.out.println("\n");
				for (linha = 0; linha < 2; linha++) {
					System.out.print("\n");
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.print(matriz2[linha][coluna] + " ");
					}
				}
			}

			// Opção inválida
			else if( op > 5 || op < 1 ){
				System.out.println("Opção inválida !!\nSair = 5");
			}

		} while (op != 5);
	}
}