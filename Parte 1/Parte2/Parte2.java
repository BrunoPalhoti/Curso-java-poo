package Parte2;

public class Parte2 {
	
	private double q1;
	private double q2;
	private double q3;
	private double q4;
	private double q5;
	private double q6;
	private double d; // cotação do doler
	private	double calculoReais;
	

	public Parte2(double q1, double q2, double q3, double q4, double q5, double q6, double d) {
		super();
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.d = d;
	}
	public void Calcular() {
		calculoReais = ( q1 + 0.5 * q2 + 0.25 * q3 + 0.1 * q4 + 0.05 * q5 + 0.01 * q6 ) * d;
		System.out.println("Total de R$ " + calculoReais);
		
	}
}
