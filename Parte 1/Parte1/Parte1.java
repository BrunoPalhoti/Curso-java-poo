package Parte1;

public class Parte1 {
	private double massa,altura,tempo,cavalos;

	public Parte1(double massa, double altura, double tempo) {
		super();
		this.massa = massa;
		this.altura = altura;
		this.tempo = tempo;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	public double getCavalos() {
		return cavalos;
	}

	public void setCavalos(double cavalos) {
		this.cavalos = cavalos;
	}

	public void calculo() {
		cavalos = massa*altura/tempo/745.6999;
		System.out.println("Serao necessario: " + cavalos + " CAVALOS");
	}
}
