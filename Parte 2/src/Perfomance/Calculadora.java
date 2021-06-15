package Perfomance;

public class Calculadora {

	private double memoria = 0;
	
	public Calculadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double somar(double n1) {
		 this.memoria = this.memoria + n1; 
		return this.memoria;
	}
	public double subtrair(double n1) {
		this.memoria = this.memoria - n1;
		return this.memoria;
	}
	
	public double multiplicar(double n1) {
		this.memoria = this.memoria * n1;
		return this.memoria;
	}
	
	public double dividir(double n1) {
		this.memoria = this.memoria / n1;
		return this.memoria;
	}

	public void exibeMemoria() {
		System.out.println(getMemoria());
	}
	
}

