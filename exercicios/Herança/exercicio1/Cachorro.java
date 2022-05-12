package Herança;

public class Cachorro extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando método Construtor
	public Cachorro(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	//Criando outros métodos
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}
