package exercicio.p3e03;

import java.util.Scanner;

public class Turma {
	static Scanner salvar = new Scanner(System.in);
	
	private int idTurma;
	private int qtdAlunos;
	private double [] notas;
	
	public Turma() {
		
	}

	public Turma(double[] notas) {
		this.notas = notas;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public Turma infoTurma() {
		System.out.print("ID: ");
		idTurma = Integer.parseInt(salvar.nextLine());
		
		System.out.print("Quantas Notas:  ");
		qtdAlunos = Integer.parseInt(salvar.nextLine());
		
		double [] notas = new double [qtdAlunos];
		for(int i=0; i<notas.length;i++) {
           System.out.print("Notas ["+(i+1)+"]: ");
           notas[i]=Double.parseDouble(salvar.nextLine());
		}
		Turma a = new Turma(notas);
		return a;
	}
	
	public double media() {
		double soma=0.0;
		for (double n:notas)
			soma += n;
		return soma/notas.length;
	}
	
	public static double mediaClasse(Turma [] c) {
		double soma = 0;
		for(Turma a :c)
			soma += a.media();
		return soma/c.length;
	}
	
}