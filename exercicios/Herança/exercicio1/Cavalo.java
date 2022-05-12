package Herança;

public class Cavalo extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando método Construtor
	public Cavalo(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}


