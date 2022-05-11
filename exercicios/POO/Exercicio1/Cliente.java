package exerciciosHoje;

public class Cliente {

	// Declarando atributos do cliente

	private String nome;
	private String idade;
	private String genero;
	private String profissao;

	// M�todo especial 

	public Cliente(String nome, String idade, String genero, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.profissao = profissao;
	}

	//m�todos adicionais
	
	public void imprimirDados() {
		System.out.println("\n\tInforma��es do Cliente\n\nNome do cliente: " + nome + "\nIdade do cliente: " + idade
				+ "\nGen�ro do cliente: " + genero + "\nProfiss�o do cliente" + profissao);
	}

	// Getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}