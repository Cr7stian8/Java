/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. 
 */

package exerciciosHoje;

import java.util.Scanner;

public class While {
	public static void main(String args[]) {

		// Criando sistema de entradad de dados
		try (Scanner leia = new Scanner(System.in)) {

			// Declarando variaveis
			int idade = 0, contador = 0, contador2 = 0;

			while (idade != -99) {
				System.out.println("Digite a sua idade: ");
				idade = leia.nextInt();

				// Idade inválida
				if (idade < 0) {
					System.out.println("Idade Inválida !!");
				}

				// Contando idade menor do que vinte e um e maior que 51
				if (idade < 21 && idade > 0) {
					contador++;
				}
				if (idade > 50) {
					contador2++;
				}
			}
			System.out.println("Pessoas com menos de 21 anos: " + contador);
			System.out.println("Pessoas com mais de 50 anos: " + contador2);
		}
	}
}