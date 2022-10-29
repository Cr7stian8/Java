/*
Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
package LaçosDeDecisao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Criando sistena de imput
		try (Scanner input = new Scanner(System.in)) {
			// declarando e Recebendo a idade
			int idade;
			System.out.println("Digite sua idade");
			idade = input.nextInt();
			// Condi��o para estar em alguma categoria
			if (idade >= 10 && idade <= 25) {
				// Testando � qual categoria a idade pertence
				if (idade >= 10 && idade < 15) {
					System.out.println("--> Voc� est� na categoria 'inf�ntil'");
				} else if (idade >= 15 && idade < 18) {
					System.out.println("--> Voc� est� na categoria 'Juvenil'");
				} else {
					System.out.println("--> Voc� est� na categoria dos Adultos");
				}
			}
			// Mensagem a pessoa cuja idade n�o possui uma categoria
			else {
				System.out.println("A idade digitada n�o se enquadra em nenhuma categoria");
			}
		}
	}
}
