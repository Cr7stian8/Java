package Polimorfismo;

public abstract class Animal {
	
	//Declarando atributos
	private String nome;
	private int idade;

	
	abstract public void emitirSom(String som);

	//Método construtor
	public Animal(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	//Criando getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}