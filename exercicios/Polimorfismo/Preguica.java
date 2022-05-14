package Polimorfismo;

public class Preguica extends Animal {

	private String subirArvores;

	public Preguica(String nome, int idade, String subirArvores) {
		super(nome, idade);
		this.subirArvores = subirArvores;
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("Som: Desconhecido");
	}

	// Imprimindo atributos da herança e do próprio objeto
	public void imprimir() {
			System.out.println("\n****Animal****");
			System.out.println("\nNome do animal: " + getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Ocupação: " + subirArvores);
	}
	public String getsubirArvores() {
		return subirArvores;
	}

	public void setsubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}

}