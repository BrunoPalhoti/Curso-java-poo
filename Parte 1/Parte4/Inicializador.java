package Parte4;

public class Inicializador {

	public static void main(String[] args) {
		Parte4 p4 = new Parte4(14,30,10);
		
		System.out.println("Soma dos segundos des das 00:00:00: " + p4.somaSeg());
		p4.subSeg();
	}
}
