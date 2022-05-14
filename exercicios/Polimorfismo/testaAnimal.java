package Polimorfismo;

/*	Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

public class testaAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Cachorro",3,"Está correndo");
		cachorro.imprimir();
		cachorro.emitirSom(null);
		Cavalo cavalo = new Cavalo("Cavalo",10,"Está correndo");
		cavalo.imprimir();
		cavalo.emitirSom(null);
		Preguica preguica = new Preguica("Preguiça",25,"Está subindo em arvores");
		preguica.imprimir();
		preguica.emitirSom(null);


	}

}