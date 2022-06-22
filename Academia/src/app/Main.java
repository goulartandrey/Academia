package app;

public class Main {

	public static void main(String[] args) {
		//Criando objetos turma, aluno e instrutor
		Instrutor i1 = new Instrutor("9110008525", "Galato", "Professor Educação Física", "15/04/1984", "99423-5445");
		Turma t1 = new Turma(30, 2, "19/06/2022", "19/12/2022", "19:00", "Jiu Jitsu", i1);
		Aluno a1 = new Aluno(1021657, 85, "Nico Lopez", "Manoel Elias, 1473", "9999-8888", "19/04/1996", 1.73);
		Aluno a2 = new Aluno(254568, 91, "Henry", "Orfanotrófio, 254", "9995-5221", "22/05/2002", 1.79);
		
		//Método de matricular os dois alunos ao ArrayList da turma
		t1.matricular(a1);
		t1.matricular(a2);
		//Mostrando a lista de alunos, seus dados, instrutor e a quantidade de alunos
		System.out.println("Dados dos Alunos da turma:" + t1.getLista());
		System.out.println("Número de alunos da turma:" + t1.getnAlunos());
		System.out.println("Instrutor da turma:" + t1.getInstrutor());
	}

}
