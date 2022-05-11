package exercicio2;

public class Aviao {
	
	//Definindo atributos
	private int lugares;
	private int tamanho;
	private String empresa;

	//método especial
	public Aviao(String empresa, int tamanho,int lugares) {
		this.empresa = empresa;
		this.tamanho = tamanho;
		this.lugares = lugares;
	}
	
	//Criando método responsável por imprimir dados do avião
	public void aviaoDados(){
		System.out.println("\n\t******Dados do avião*******"+"\n\nEmpresa responsável: "+empresa
			+"\nTamanho em metros: "	+tamanho+"\nLugares disponiveis: "+lugares);
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
