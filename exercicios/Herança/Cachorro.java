package Herança.exercicio1;

public class Cachorro extends Animal{
	
	//Criando atributo da subclasse
	private String acao;
	
	//Criando método Construtor
	public Cachorro(String nome, int idade,String som,String acao) {
		super(nome, idade, som);
		this.acao=acao;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome do Cachorro é: "+getNome());
		System.out.println("O cachorro tem: "+getIdade()+" Anos");
		System.out.println("O som do Cachorro é: "+getSom());
		System.out.println("A ação do cachorro é: "+acao);
	}
	
	//Criando outros métodos
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}
