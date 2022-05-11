package exercicio2;

public class Aviao {
	
	//Definindo atributos
	private int lugares;
	private int tamanho;
	private String empresa;

	//m�todo especial
	public Aviao(String empresa, int tamanho,int lugares) {
		this.empresa = empresa;
		this.tamanho = tamanho;
		this.lugares = lugares;
	}
	
	//Criando m�todo respons�vel por imprimir dados do avi�o
	public void aviaoDados(){
		System.out.println("\n\t******Dados do avi�o*******"+"\n\nEmpresa respons�vel: "+empresa
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
