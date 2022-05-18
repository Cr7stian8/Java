package Metodos;

public class carro {
	String cor;
	String modelo;
	int velocidadeAtual;
	int velocidadeMaxima;
	
	void exiberDados() {
		System.out.println("Cor: "+ cor);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Velocidade atual: "+ velocidadeAtual);
		System.out.println("Velocidade maxima: "+ velocidadeMaxima);
	}
}