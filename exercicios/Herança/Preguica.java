package Herança;

public class Preguica extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando m�todo Construtor
	public Preguica(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome da Pregui�a �: "+getNome());
		System.out.println("O pregui�a tem: "+getIdade()+" Anos");
		System.out.println("O som da pregui�a �: "+getSom());
		System.out.println("A a��o da pregui�a �: "+acao);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}