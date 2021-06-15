package Parte2;

import java.lang.Math;

public class Triangulo {
	private double base;
	private double altura;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		double res;
		res = getBase() * getAltura()/ 2;
		return res;
	}
	
	public double getPerimetro() {
		double res;
		res = getBase() + getAltura() + (Math.sqrt(getBase()*getBase() + getAltura()*getAltura()));
		return res;
	}
}
