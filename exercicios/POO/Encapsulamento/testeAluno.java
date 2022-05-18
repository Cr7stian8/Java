package Encapsulamento;

public class testeAluno {

	public static void main(String[] args) {
		
		//Criando objeto do tipo aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Cristiano");
		aluno1.setIdade("18");
		
		//Mostrando o nome e a idade do aluno
		System.out.println("Nome: "+aluno1.getNome());
		int idade;
		idade = Integer.parseInt(aluno1.getIdade());
		System.out.println("Idade: "+idade+" Anos");
	}

}
