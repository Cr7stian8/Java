/*
Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

package exerciciosHoje;

public class For {

	public static void main(String[] args) {

		// Declarando o número
		int numero;

		// Laço para definir o intervalo
		for (numero = 1000; numero < 2000; numero++) {

			// Condição para informar o número
			if (numero % 11 == 5) {

				// Exibindo números que divididos por 11 possuem resto igual a 5
				System.out.println(numero);
			}
		}
	}

}
