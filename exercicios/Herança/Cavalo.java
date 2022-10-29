package Herança;

public class Cavalo extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando m�todo Construtor
	public Cavalo(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do Cavalo �: "+getNome());
		System.out.println("O cavelo tem: "+getIdade()+" Anos");
		System.out.println("O som do Cavalo �: "+getSom());
		System.out.println("A a��o do cavalo �: "+acao);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}


