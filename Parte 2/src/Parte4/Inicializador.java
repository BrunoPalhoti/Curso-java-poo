package Parte4;

public class Inicializador {

	public static void main(String[] args) {
	
		AlunoDisciplina aluno1 = new AlunoDisciplina(1,2);
		AlunoDisciplina aluno2 = new AlunoDisciplina(2,7);
		
		aluno1.setNotaB1(8.2);
		aluno1.setNotaB2(10.0);
		
		aluno2.setNotaB1(7.8);
		aluno2.setNotaB2(6.7);
		
		System.out.println("Media Arimetica do aluno "+aluno1.getIdAluno()+": " + aluno1.mediaAritmetica());
		System.out.println("Media Ponderada do aluno "+aluno1.getIdAluno()+": " + aluno1.mediaPonderada());
		
		System.out.println("Media Arimetica do aluno "+aluno2.getIdAluno()+": " + aluno2.mediaAritmetica());
		System.out.println("Media Ponderada do aluno "+aluno2.getIdAluno()+": " + aluno2.mediaPonderada());
	}

}
