package Parte4;

public class Parte4 {
	private int hora, minuto, seg;
	private int horaSeg, minutoSeg;
	private int somaSeg, subtracaoSeg;
	
	
	public Parte4(int hora, int minuto, int seg) {
		this.hora = hora;
		this.minuto = minuto;
		this.seg = seg;
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
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public int somaSeg() {
		horaSeg 	= hora * 3600;
		minutoSeg	= minuto * 60;
		somaSeg		= horaSeg + minutoSeg + seg;
		
		return somaSeg;
	}

	public void subSeg() {
		subtracaoSeg = 86400 - somaSeg();
		System.out.println("Quanto ainda falta para meia-noite: " + subtracaoSeg);
	}
}
