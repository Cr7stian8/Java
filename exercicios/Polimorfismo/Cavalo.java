package Polimorfismo;

public class Cavalo extends Animal {

	private String correr;

	public Cavalo(String nome, int idade, String correr) {
		super(nome, idade);
		this.correr=correr;
	}

	@Override
	public void emitirSom(String som){
		System.out.println("Som: iiriririi");
	}

	//Imprimindo atributos da herança e do próprio objeto
		public void imprimir() {
			System.out.println("\n****Animal****");
			System.out.println("\nNome do animal: " + getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Ocupação: " + correr);
		}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}



}