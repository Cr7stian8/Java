/*
Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. 
*/
package Repetição;

import java.util.Scanner;

public class For_2 {

	public static void main(String[] args) {
		int loop,numero,pares=0,impares=0;
		//Criando sistema de entrada
		try (Scanner leia = new Scanner (System.in)) {
			//Criando loop para receber os n�meros
			for( loop=0 ; loop<10; loop++ ) {
				//Recebendo os n�meros
				System.out.println("Digite um n�mero inteiro: ");
				numero = leia.nextInt();
				//Verificando se � par ou �mpar
				if( numero%2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		//mostrando quantidade de par e �mpar
		System.out.println("Quantidade de n�meros pares: "+pares);
		System.out.println("Quantidade de n�meros �mpares: "+impares);
	}

}
