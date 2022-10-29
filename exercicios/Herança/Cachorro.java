package Herança;

public class Cachorro extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando m�todo Construtor
	public Cachorro(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do Cachorro �: "+getNome());
		System.out.println("O cachorro tem: "+getIdade()+" Anos");
		System.out.println("O som do Cachorro �: "+getSom());
		System.out.println("A a��o do cachorro �: "+acao);
	}
	
	//Criando outros m�todos
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}
