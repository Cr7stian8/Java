package Heran�a;

public class Cachorro extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando m�todo Construtor
	public Cachorro(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	//Criando outros m�todos
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}
