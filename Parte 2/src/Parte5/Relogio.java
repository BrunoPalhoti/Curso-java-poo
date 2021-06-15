package Parte5;

import java.time.LocalTime;

public class Relogio {
	private int hora;
	private int minuto;
	private int segunda;
	
	public Relogio(int hora, int minuto, int segunda) {
		this.hora = hora;
		this.minuto = minuto;
		this.segunda = segunda;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegunda() {
		return segunda;
	}

	public void setSegunda(int segunda) {
		this.segunda = segunda;
	}
	
	public void adiantar(int seg) {
		 LocalTime add = LocalTime.of(getHora(),getMinuto(),getSegunda()).plusSeconds(seg);
		 System.out.println("Adiantou : " + seg + " segundos");
	     System.out.println("Hora adiantada: " +add);	
	}
	
	public void atrasar(int seg) {
		LocalTime menos = LocalTime.of(getHora(),getMinuto(),getSegunda()).minusSeconds(seg);
		System.out.println("Atrasou : " + seg + " segundos");
        System.out.println("Hora atrasada:" +menos);
	}
	
	public void exibeHorario(int seg) {
		adiantar(seg); 
		atrasar(seg);
	}
}
