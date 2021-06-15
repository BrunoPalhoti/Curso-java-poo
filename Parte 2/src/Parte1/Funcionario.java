package Parte1;

public class Funcionario {
	private int codFunc;
	private String nomeFunc;
	private double salarioMensal;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
		super();
		this.codFunc = codFunc;
		this.nomeFunc = nomeFunc;
		this.salarioMensal = salarioMensal;
	}

	public int getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioAnual() {
		return this.salarioMensal = this.salarioMensal *12;
	}
	
	public void setAumento(double per) {
		double aumento = this.getSalarioMensal()*((100 + per)*0.01);
		System.out.println("Cogigo Funcionario: " + getCodFunc() + "\t\tNome: " + getNomeFunc() + "\t\tSalario Mensal: R$" + aumento);
	}
}
