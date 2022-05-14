package Herança.exercicio1;

public class Cavalo extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando método Construtor
	public Cavalo(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do Cavalo é: "+getNome());
		System.out.println("O cavelo tem: "+getIdade()+" Anos");
		System.out.println("O som do Cavalo é: "+getSom());
		System.out.println("A ação do cavalo é: "+acao);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}


