package parte1;

import java.util.Date;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno() {
		super();
		
	}

	public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		
		this.matricula = matricula;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double tiraCopias(int qtd) {
		
		return qtd *0.07;
	}
}
