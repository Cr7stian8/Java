package Metodos;

public class testeCarro {
	public static void main(String[] args) {
		carro meuCarro = new carro();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Tesla";
		meuCarro.velocidadeAtual = 50;
		
		meuCarro.exiberDados();
		
	}
}