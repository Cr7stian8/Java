/*
Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: 
o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.
 */
package Repetição;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		// Inicializando variaveis

		try (Scanner leia = new Scanner(System.in)) {
			//Declarando variaveis
			//Obs: Risco amarelo significa que a variavel n�o foi exibida no console
			int psicologico = 0, loop = 0, idade, genero, calmas = 0, nervosas=0, agressivas=0, homens=0,
					mulheres=0, naobinarios=0, mulherNervosa = 0, homemAgressivo = 0, naoBinariaCalma = 0,
					nervosaMaior40 = 0, calmaMenor18 = 0;
			while (loop < 5) {
				//Primeira tentativa de receber a idade
				System.out.println("Qual a sua idade? ");
				idade = leia.nextInt();
				//Negando idades inv�lidas
				while (idade < 1 || idade > 130) {
					System.out.println("Op��o inv�lida !!!");
					System.out.println("Qual a sua idade? ");
					idade = leia.nextInt();
				}
				//Primeira tentativa de receber o gen�ro
				System.out.println("Qual seu sexo? \n1-Masculino\n2-Feminino\n3-N�o bin�rio");
				genero = leia.nextInt();
				//Negando op��es inv�lidas
				while (genero < 1 || genero > 3) {
					System.out.println("Op��o inv�lida !!!");
					System.out.println("Qual seu sexo? \n1-Masculino\n2-Feminino\n3-N�o bin�rio");
					genero = leia.nextInt();
				}
				//Contando a quantidade de pessoas de cada g�nero
				if (genero == 1) {
					homens++;
				} else if (psicologico == 2) {
					mulheres++;
				} else {
					naobinarios++;
				}
				//Primeira tentativa de receber o perfil psicologico
				System.out.println("Voc� � uma pessoa? \n1-calma\n2-nervosa\n3-Agressiva");
				psicologico = leia.nextInt();
				//Negando op��es inv�lidas caso digitadas
				while (psicologico < 1 || psicologico > 3) {
					System.out.println("Op��o inv�lida !!!");
					System.out.println("Voc� � uma pessoa? \n1-calma\n2-nervosa\n3-Agressiva");
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
				//Contando pessoas calmas n�o bin�rias
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
			System.out.println("n�mero de pessoas calmas: " + calmas);
			System.out.println("n�mero de mulheres nervosas: " + mulherNervosa);
			System.out.println("n�mero de homens agressivos: " + homemAgressivo);
			System.out.println("n�mero de n�o binarios calmos: " + naoBinariaCalma);
			System.out.println("n�mero de pessoas nervosas com mais de 40 anos: " + nervosaMaior40);
			System.out.println("n�mero de pessoas calmas com menos de 18 anos: " + calmaMenor18);
		}
	}
}
