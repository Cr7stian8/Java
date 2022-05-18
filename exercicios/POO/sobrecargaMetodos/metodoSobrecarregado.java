package sobrecargaMetodos;

public class metodoSobrecarregado {

	
	public void testaMetodoSobrecarregado() {
		System.out.println("salario em numero inteiro: "+ salario(100000));
		System.out.println("salario em numero Real: "+ salario(1034.58));
	}
	
	
	public int salario(int valorInt) {
		return valorInt;
	}
	
	
	public double salario(double valorDouble) {
		return valorDouble;
	}
	
}