package parte1;

public class Professor extends Pessoa {
	private double salario;
	private String disciplina;
	
	public Professor () {
		super();
	}
	
	public Professor(double salario, String disciplina) {
		super();
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
}
