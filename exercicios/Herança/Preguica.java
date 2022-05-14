package Herança.exercicio1;

public class Preguica extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando método Construtor
	public Preguica(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome da Preguiça é: "+getNome());
		System.out.println("O preguiça tem: "+getIdade()+" Anos");
		System.out.println("O som da preguiça é: "+getSom());
		System.out.println("A ação da preguiça é: "+acao);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}