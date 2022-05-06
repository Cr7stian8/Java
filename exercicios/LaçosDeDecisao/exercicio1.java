package LaçosDeDecisão;

import java.util.Scanner;

/*
Faça um exercício que recebe três inteiros e diga qual deles é o maior 
 */
public class exercicio1 {
	public static void main(String[] args) {

		// Declarando variáveis
		int n1, n2, n3, maior = 0;

		// Criando leia e importando biblioteca
		try (Scanner leia = new Scanner(System.in)) {

			// Recebendo os números
			System.out.println("Digite um número: ");
			n1 = leia.nextInt();
			System.out.println("Digite um número: ");
			n2 = leia.nextInt();
			System.out.println("Digite um número: ");
			n3 = leia.nextInt();

			if (n1 > maior) {
				maior = n1;
			}
			if (n2 > maior) {
				maior = n2;
			}
			if (n3 > maior) {
				maior = n3;
			}
			System.out.println("O maior número é: " + maior);
		}
	}
}