/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
*/
package exerciciosHoje;

import java.util.Scanner;

public class For_2 {

	public static void main(String[] args) {
		int loop,numero,pares=0,impares=0;
		//Criando sistema de entrada
		try (Scanner leia = new Scanner (System.in)) {
			//Criando loop para receber os números
			for( loop=0 ; loop<10; loop++ ) {
				//Recebendo os números
				System.out.println("Digite um número inteiro: ");
				numero = leia.nextInt();
				//Verificando se é par ou ímpar
				if( numero%2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		//mostrando quantidade de par e ímpar
		System.out.println("Quantidade de números pares: "+pares);
		System.out.println("Quantidade de números ímpares: "+impares);
	}

}
