package LaçosDeDecisao;

import java.util.Scanner;

/*
Fa�a um exerc�cio que recebe tr�s inteiros e diga qual deles � o maior 
 */
public class exercicio1 {
	public static void main(String[] args) {

		// Declarando vari�veis
		int n1, n2, n3, maior = 0;

		// Criando leia e importando biblioteca
		try (Scanner leia = new Scanner(System.in)) {

			// Recebendo os n�meros
			System.out.println("Digite um n�mero: ");
			n1 = leia.nextInt();
			System.out.println("Digite um n�mero: ");
			n2 = leia.nextInt();
			System.out.println("Digite um n�mero: ");
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
			System.out.println("O maior n�mero �: " + maior);
		}
	}
}