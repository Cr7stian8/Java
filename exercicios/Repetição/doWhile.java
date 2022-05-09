/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
 */
package exerciciosHoje;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		// Declarando leitura de dados
		try (Scanner leia = new Scanner(System.in)) {
			// Criando variavel do numero
			int numero, soma = 0;
			// Recebendo o número e somando os números digitados
			do {
				System.out.println("Digite um número inteiro: ");
				numero = leia.nextInt();
				soma += numero;
			} while (numero != 0);
			// Excrevendo a soma dos números
			System.out.println("A soma dos números é: " + soma);
		}
	}
}
