package programacaoSequencial;

import java.util.Scanner;

/*
Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
expressa apenas em dia
 */

public class exercicio1 {
	public static void main(String[] args) {
		
		//Iniciando variaveis
		int anos, meses, dias, anos_em_dias, meses_em_dia,dias_de_vida;
		
			try (Scanner leia = new Scanner(System.in)) {
				
				//recebendo idade
				System.out.println("Qual sua idade em anos? ");
				anos = leia.nextInt();
				System.out.println("Qual sua idade em meses? ");
				meses = leia.nextInt();
				System.out.println("Qual sua idade em dias? ");
				dias = leia.nextInt();
				
				//transformando em dias e mostrando o resultado
				anos_em_dias = anos*365;
			}
		
			meses_em_dia = meses*30;
			dias_de_vida = meses_em_dia+anos_em_dias+dias;
			System.out.println("Você viveu : "+dias_de_vida+" Dias");
	}
}