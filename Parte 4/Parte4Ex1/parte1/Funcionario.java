package parte1;

import java.util.Date;

public class Funcionario extends Pessoa{
	private double salario;
	private Date dataAdmissao;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(double salario, Date dataAdmissao) {
		super();
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
