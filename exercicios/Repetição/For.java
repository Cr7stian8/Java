/*
Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

package Repetição;

public class For {

	public static void main(String[] args) {

		// Declarando o n�mero
		int numero;

		// La�o para definir o intervalo
		for (numero = 1000; numero < 2000; numero++) {

			// Condi��o para informar o n�mero
			if (numero % 11 == 5) {

				// Exibindo n�meros que divididos por 11 possuem resto igual a 5
				System.out.println(numero);
			}
		}
	}

}
