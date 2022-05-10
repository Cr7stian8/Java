/*
1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */
package exerciciosHoje;

public class Vetor {

	public static void main(String[] args) {

		// Criando vetor 'A'
		int[] a = new int[6];

		// Criando variavel 'simples' e variavel de loop para o for
		int simples, loop;

		// Atribuindo valores ao vetor
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = 7;

		// Somando posi��es e atribuindo a variavel 'simples'
		simples = a[0] + a[1] + a[5];

		// Mostrando a variavel da soma das posi��es no console
		System.out.println("Variavel simples: " + simples);

		// Modificando a 4 posi��o do vetor para 100
		a[3] = 100;

		// Mostrando na tela cada valor do vetor A, um em cada linha.
		for (loop = 0; loop < 6; loop++) {
			System.out.println("\nPosi��o " + (loop + 1) + " do vetor = " + a[loop]);
		}
	}

}
