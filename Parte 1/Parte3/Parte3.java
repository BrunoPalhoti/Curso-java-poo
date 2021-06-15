package Parte3;

public class Parte3 {
	
	private double kelvin;
	private double fahrenheit;
	private double reaumur;
	private double rankine;
	private double celsius;
	
	
public Parte3(double celsius) {
		super();
		this.celsius = celsius;
	}

public double getCelsius() {
	return celsius;
}


public void setCelsius(double celsius) {
	this.celsius = celsius;
}

public void calculoKelvin() {
	kelvin 	= celsius * 1.8 + 32;
	System.out.println("A temperatura em Kelvin é:" + kelvin);

	}

public void calculoFahrenheit() {
	fahrenheit	= celsius + 273.15;
	System.out.println("A temperatura em Fahrenheit é:" + fahrenheit);
}

public void calculoReaumur() {
	reaumur	= celsius * 1.8 + 32 + 459.67;
	System.out.println("A temperatura em Reaumur é:" + reaumur);
}

public void calculoRankine() {
	rankine	= celsius * 0.8;
	System.out.println("A temperatura em Rankine é:" + rankine);
	}

}
