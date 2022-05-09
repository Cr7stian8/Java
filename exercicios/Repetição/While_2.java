/*
Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: 
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
 */
package exerciciosHoje;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		// Inicializando variaveis

		try (Scanner leia = new Scanner(System.in)) {
			//Declarando variaveis
			//Obs: Risco amarelo significa que a variavel não foi exibida no console
			int psicologico = 0, loop = 0, idade, genero, calmas = 0, nervosas=0, agressivas=0, homens=0,
					mulheres=0, naobinarios=0, mulherNervosa = 0, homemAgressivo = 0, naoBinariaCalma = 0,
					nervosaMaior40 = 0, calmaMenor18 = 0;
			while (loop < 5) {
				//Primeira tentativa de receber a idade
				System.out.println("Qual a sua idade? ");
				idade = leia.nextInt();
				//Negando idades inválidas
				while (idade < 1 || idade > 130) {
					System.out.println("Opção inválida !!!");
					System.out.println("Qual a sua idade? ");
					idade = leia.nextInt();
				}
				//Primeira tentativa de receber o genêro
				System.out.println("Qual seu sexo? \n1-Masculino\n2-Feminino\n3-Não binário");
				genero = leia.nextInt();
				//Negando opções inválidas
				while (genero < 1 || genero > 3) {
					System.out.println("Opção inválida !!!");
					System.out.println("Qual seu sexo? \n1-Masculino\n2-Feminino\n3-Não binário");
					genero = leia.nextInt();
				}
				//Contando a quantidade de pessoas de cada gênero
				if (genero == 1) {
					homens++;
				} else if (psicologico == 2) {
					mulheres++;
				} else {
					naobinarios++;
				}
				//Primeira tentativa de receber o perfil psicologico
				System.out.println("Você é uma pessoa? \n1-calma\n2-nervosa\n3-Agressiva");
				psicologico = leia.nextInt();
				//Negando opções inválidas caso digitadas
				while (psicologico < 1 || psicologico > 3) {
					System.out.println("Opção inválida !!!");
					System.out.println("Você é uma pessoa? \n1-calma\n2-nervosa\n3-Agressiva");
					psicologico = leia.nextInt();
				}
				//Contando quantidade de cada perfil
				if (psicologico == 1) {
					calmas++;
				} else if (psicologico == 2) {
					nervosas++;
				} else {
					agressivas++;
				}//Contando mulheres nervosas
				if (genero == 2 && psicologico == 2) {
					mulherNervosa++;
				}
				//Contando homens agressivos
				if (genero == 1 && psicologico == 3) {
					homemAgressivo++;
				}
				//Contando pessoas calmas não binárias
				if (genero == 3 && psicologico == 1) {
					naoBinariaCalma++;
				}
				//Contando pessoas nervosas maior de 40 
				if (idade > 40 && psicologico == 2) {
					nervosaMaior40++;
				}
				//Contando pessoas calmas menor de 18
				if (idade < 18 && psicologico == 1) {
					calmaMenor18++;
				}
				//Aumentando variavel de loop para receber os dados de 5 pessoas
				loop++;
			}
			//Escrevendo mensagens solicitadas
			System.out.println("número de pessoas calmas: " + calmas);
			System.out.println("número de mulheres nervosas: " + mulherNervosa);
			System.out.println("número de homens agressivos: " + homemAgressivo);
			System.out.println("número de não binarios calmos: " + naoBinariaCalma);
			System.out.println("número de pessoas nervosas com mais de 40 anos: " + nervosaMaior40);
			System.out.println("número de pessoas calmas com menos de 18 anos: " + calmaMenor18);
		}
	}
}
