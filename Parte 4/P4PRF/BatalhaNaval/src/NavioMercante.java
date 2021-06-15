public class NavioMercante extends Navio {
	private double capacidadeCarga;
	private double carga;
	
	public NavioMercante(int numTripulantes,
			             String nome, 
			             double capacidadeCarga, 
			             double carga) {
		super(numTripulantes, nome);
		this.capacidadeCarga = capacidadeCarga;
		this.carga = carga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public void carregamento(int p1) {
		carga += p1;
		if (carga > capacidadeCarga)
			carga = capacidadeCarga;
		super.exibirInfoGeral();
		System.out.println("Volume ocupado: \t "+carga/capacidadeCarga);
	}

}
