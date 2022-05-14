package Polimorfismo;

public class Cachorro extends Animal {

	//Atributos
	private String correr;

	// Criando subclasse
	public Cachorro(String nome, int idade, String correr) {
		super(nome, idade);
		this.correr = correr;
	}

	//Fun��o para imprimir som 
	@Override
	public void emitirSom(String som) {
		System.out.println("SOM: AuAu");
	}

	//Imprimindo atributos da heran�a e do pr�prio objeto
	public void imprimir() {
		System.out.println("\n****Animal****");
		System.out.println("\nNome do animal: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Ocupa��o: " + correr);
	}

	

}