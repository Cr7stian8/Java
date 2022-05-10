/*
 
2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

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

			// Passando pelas posições do vetor
			for (i = 0; i < 6; i++) {
				System.out.println("Digite a posição " + (i + 1) + " do vetor");
				vetor[i] = leia.nextInt();

				// Verificando se o número digitado é par ou ímpar
				if (vetor[i] % 2 == 0) {
					somaPar += vetor[i];
				}
				
				//Caso contrario adicione mmais 1 a contagem dos ímpares
				else {
					impar++;
				}
			
			}

			for (i = 0; i < 6; i++) {

				// Verificando se o número digitado é par ou ímpar
				if (vetor[i] % 2 == 0) {

					// Mostrando par
					System.out.println(vetor[i] + "<-- é par");

				} else {

					// Mostrando impar
					System.out.println(vetor[i] + "<-- é impar");

				}
			}

			// Mostrando soma dos pares e quantidade de ímpares
			System.out.println("soma dos números pares digitados: " + somaPar);
			System.out.println("quantidade de números ímpares digitados: " + impar);

		}
	}
}