/*
 Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).
 */
package Repetição;

import java.util.Scanner;

public class doWhile_2 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

			// declarando variaveis
			int numero, multiplo3 = 0, divisor = 0, media;
			do {
				//Recebendo o número
				System.out.println("Digite um n�mero: ");
				numero = input.nextInt();

				//Verificando se o número é multiplo de 3
				if (numero % 3 == 0 && numero != 0) {
					multiplo3 += numero;
					divisor++;
				}
			} while (numero != 0);

			// Calculando a média dos multiplos de 3
			media = multiplo3 / divisor;
			System.out.println("A média dos números multiplos de três é: " + media);
		}
	}
}
