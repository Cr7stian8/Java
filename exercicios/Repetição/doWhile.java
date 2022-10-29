/*
Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
 */
package Repetição;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		// Declarando leitura de dados
		try (Scanner leia = new Scanner(System.in)) {
			// Criando variavel do numero
			int numero, soma = 0;
			// Recebendo o n�mero e somando os n�meros digitados
			do {
				System.out.println("Digite um n�mero inteiro: ");
				numero = leia.nextInt();
				soma += numero;
			} while (numero != 0);
			// Excrevendo a soma dos n�meros
			System.out.println("A soma dos n�meros �: " + soma);
		}
	}
}
