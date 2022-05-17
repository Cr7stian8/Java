/*
3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List

Remover dados da list;

Atualizar dados da list.

Apresentar todos os dados da list.
 */

package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		// Criando vetor dinâmico
		List<String> estoque = new ArrayList<>();

		// opção do menu e produto selecionado
		int op, produtoSelecionado, contador = 1;

		// Iniciando o produto
		String produto;

		try (Scanner leia = new Scanner(System.in)) {
			do {
				System.out.println("---------------------------------------");
				System.out.println("--> [1] Adicionar produto ");
				System.out.println("--> [2] Remover produto ");
				System.out.println("--> [3] Substituir produto ");
				System.out.println("--> [4] Mostrar todos produtos ");
				System.out.println("--> [press enything] Sair do sistema ");
				System.out.println("---------------------------------------");
				op = leia.nextInt();

				if (op == 1) {// Caso 1
					System.out.println("--> Qual o nome do item que deseja adicionar no estoque? ");
					produto = leia.next();
					estoque.add(produto);
				}

				else if (op == 2) { // Caso 2
					System.out.println("--> Qual o nome do item que deseja remover do estoque? ");
					produto = leia.next();
					estoque.remove(produto);
				}

				else if (op == 3) { // Caso 3
					// Rodando pela lista dinâmica
					System.out.println("****** Estoque ******");
					for (String i : estoque) {
						// Escrevendo cada produto
						System.out.println("[" + contador + "] = " + i);
						contador++;
					}

					// Removendo o produto selecionado
					System.out.println("Deseja substituir qual produto: ");
					produto = leia.next();
					produtoSelecionado = Integer.parseInt(produto);
					produto = estoque.get(produtoSelecionado - 1);
					estoque.remove(produto);

					// Adicionando novo produto
					System.out.println("Qual o novo produto? ");
					produto = leia.next();
					estoque.add(produto);
					contador = 1;
				} else if (op == 4) {

					// Deixando agradável
					System.out.println("**** ITENS EM ESTOQUE *****\n");

					// Mostrando todos os dados da lista
					for (String i : estoque) {
						System.out.println(i);
					}
				}

				else {
					System.out.println(" Goodbye ... ");
					op = 0;
				}

			} while (op != 0);
		}
	}
}
