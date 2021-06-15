package Parte6;

public class Parte6 {
	private double area,raio,perimetro;

	public Parte6( double raio) {
		this.raio = raio;
	
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void perimetro() {
		 perimetro = 2 * 3.14159 * raio;
		
		System.out.println("Perimetro: " + perimetro);
	}
	
	public void area() {
		area = 3.14159 * (raio * raio);
		System.out.println("Area: " + area);
	}
}
