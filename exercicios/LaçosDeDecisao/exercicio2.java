/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
package lacoRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Criando sistena de imput
		try (Scanner input = new Scanner(System.in)) {
			// declarando e Recebendo a idade
			int idade;
			System.out.println("Digite sua idade");
			idade = input.nextInt();
			// Condição para estar em alguma categoria
			if (idade >= 10 && idade <= 25) {
				// Testando à qual categoria a idade pertence
				if (idade >= 10 && idade < 15) {
					System.out.println("--> Você está na categoria 'infântil'");
				} else if (idade >= 15 && idade < 18) {
					System.out.println("--> Você está na categoria 'Juvenil'");
				} else {
					System.out.println("--> Você está na categoria dos Adultos");
				}
			}
			// Mensagem a pessoa cuja idade não possui uma categoria
			else {
				System.out.println("A idade digitada não se enquadra em nenhuma categoria");
			}
		}
	}
}
