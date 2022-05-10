/*
 
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */
package exerciciosHoje;

import java.util.Scanner;

public class Vetor_2 {

	public static void main(String[] args) {

		// Criando vetor
		int[] vetor = new int[6];

		// Criando contador e somador
		int impar = 0, somaPar = 0, i;

		try (// Criando sistema de entrada de dados
				Scanner leia = new Scanner(System.in)) {

			// Passando pelas posi��es do vetor
			for (i = 0; i < 6; i++) {
				System.out.println("Digite a posi��o " + (i + 1) + " do vetor");
				vetor[i] = leia.nextInt();

				// Verificando se o n�mero digitado � par ou �mpar
				if (vetor[i] % 2 == 0) {
					somaPar += vetor[i];
				}
				
				//Caso contrario adicione mmais 1 a contagem dos �mpares
				else {
					impar++;
				}
			
			}

			for (i = 0; i < 6; i++) {

				// Verificando se o n�mero digitado � par ou �mpar
				if (vetor[i] % 2 == 0) {

					// Mostrando par
					System.out.println(vetor[i] + "<-- � par");

				} else {

					// Mostrando impar
					System.out.println(vetor[i] + "<-- � impar");

				}
			}

			// Mostrando soma dos pares e quantidade de �mpares
			System.out.println("soma dos n�meros pares digitados: " + somaPar);
			System.out.println("quantidade de n�meros �mpares digitados: " + impar);

		}
	}
}