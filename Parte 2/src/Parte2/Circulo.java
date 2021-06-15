package Parte2;

public class Circulo {
	private double raio;
	
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		double res = getRaio()*getRaio()*3.14159;
		return res;
	} 
	
	public double getPerimetro() {
		double res = getRaio()*2*3.14159;
		return res;
	}	
}
