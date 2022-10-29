package Herança;

public class testeAnimal {

	public static void main(String[] args) {
		System.out.println("*****Dados do cavalo*****");
		Cavalo cavalo1 = new Cavalo ("Jos�",25,"Irreeee","Correr");
		cavalo1.imprimirInfo();
		
		System.out.println("*****Dados da pregui�a*****");
		Preguica preguica1 = new Preguica ("Maria",5,"Desconhecido","Suibir em arvores");
		preguica1.imprimirInfo();
		
		System.out.println("*****Dados do cachorro*****");
		Cachorro cachorro1 = new Cachorro ("belinha",8,"Au Au Au","Correr e Latir");
		cachorro1.imprimirInfo();
	}
}
