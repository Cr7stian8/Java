package Polimorfismo;

/*	Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

public class testaAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Cachorro",3,"Est� correndo");
		cachorro.imprimir();
		cachorro.emitirSom(null);
		Cavalo cavalo = new Cavalo("Cavalo",10,"Est� correndo");
		cavalo.imprimir();
		cavalo.emitirSom(null);
		Preguica preguica = new Preguica("Pregui�a",25,"Est� subindo em arvores");
		preguica.imprimir();
		preguica.emitirSom(null);


	}

}