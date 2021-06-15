package Parte4;

public class AlunoDisciplina {
	private int idAluno;
	private int idDisciplina;
	private double notaB1,notaB2;
	
	public AlunoDisciplina() {
		super();
	}
	
	public AlunoDisciplina(int idAluno, int idDisciplina) {
		super();
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
	}

	public int getIdAluno() {
		return idAluno;
	}
	
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	
	public int getIdDisciplina() {
		return idDisciplina;
	}
	
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	public double getNotaB1() {
		return notaB1;
	}
	
	public void setNotaB1(double notaB1) {
		this.notaB1 = notaB1;
	}
	
	public double getNotaB2() {
		return notaB2;
	}
	
	public void setNotaB2(double notaB2) {
		this.notaB2 = notaB2;
	}
	
	public double mediaAritmetica() {
		return (getNotaB1() + getNotaB2()) / 2;
	}
	
	public double mediaPonderada() {
		return ((getNotaB1()*4)+(getNotaB2()*6))/(4+6);
	}
}
