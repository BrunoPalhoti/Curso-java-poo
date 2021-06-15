package exercicio.p3e03;

import java.util.Scanner;

public class Inicializador {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		
		Turma tt = new Turma();
		
		System.out.println("Quantos Alunos: ");
		tt.setQtdAlunos(salvar.nextInt());
		
		Turma t[] = new Turma[tt.getQtdAlunos()];
		
		for(int i=0; i<tt.getQtdAlunos(); i++) {
			t [i] = tt.infoTurma();
			System.out.println("Media das Notas = "+t[i].media());
		}
		System.out.println("Media das CLASSE = "+ tt.mediaClasse(t));
	}	
}


