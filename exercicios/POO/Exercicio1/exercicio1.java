/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package exerciciosHoje;

public class exercicio1 {
	//Função main para o programa rodar
	public static void main(String[] args) {
		//Criando um cliente
		Cliente cliente1 = new Cliente("Cristiano", "18 anos", "Masculino", "Desenvolvedor Java");
		//Imprimindo dados do cliente
		cliente1.imprimirDados();
	}
}
