public class Tcosseno {
	
	private double x;
	private double[] parcelas;
	private double cosseno;
	//Get 
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double[] getParcelas() {
		return parcelas;
	}
	public void setParcelas(double[] parcelas) {
		this.parcelas = parcelas;
	}
	public double getCosseno() {
		return cosseno;
	}
	public void setCosseno(double cosseno) {
		this.cosseno = cosseno;
	}
	
	public Tcosseno(double x) {
		this.x = x;
		parcelas = new double[10];
		calculaParcelas();
		somaParcelas();
	}
	public void exibir(){
		System.out.println(cosseno);
	}
	public Tcosseno() {
		
	}

	//M�todos
	public int fatorial2 ( int valorEntrada) {
		int Decrementa=0;
		int resultado = 0;
		if (valorEntrada == 0 ){
			return 1;
		}else {
			resultado = valorEntrada;
			Decrementa = 1;
						while( Decrementa < valorEntrada) {
							resultado = resultado *( valorEntrada - Decrementa);
							Decrementa = Decrementa + 1;
			}
			return resultado;
		}
		
	}
	
	public void calculaParcelas() {
		double sinal =1;

		for(int i = 0; i < parcelas.length ; i++){
			parcelas[i] =
					sinal * 1/fatorial2(i*2)*
					Math.pow(x, i*2);
					sinal *= -1;
		//				+ 1/fatorial2(4)*Math.pow(x, 2) - 1/fatorial2(6)*Math.pow(x, 2) + 1/fatorial2(8)*Math.pow(x, 2) - 1/fatorial2(10)*Math.pow(x, 2) + 1/fatorial2(12)*Math.pow(x, 2) - 1/fatorial2(14) * Math.pow(x, 2) + 1/fatorial2(16) * Math.pow(x, 2) - 1/fatorial2(18)*Math.pow(x, 2);
		}

	}

	public void somaParcelas() {
		double soma=0.0;
		for(double v:parcelas)
			soma += v;
		this.cosseno = soma;
	}

	public String toString() {
		return "MSG";
	}
}
