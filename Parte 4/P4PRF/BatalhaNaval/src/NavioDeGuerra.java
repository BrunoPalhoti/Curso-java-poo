
public abstract class NavioDeGuerra extends Navio{
	protected double blindagem;
	protected double ataque;

	public NavioDeGuerra(int numTripulantes,
                         String nome,
                         double blindagem,
                         double ataque) {
		super(numTripulantes, nome);
		this.blindagem = blindagem;
		this.ataque = ataque;
	}

	public double getBlindagem() {
		return blindagem;
	}
	public double getAtaque() {
		return ataque;
	}
	/////
	public void setBlindagem(double blindagem) {
		this.blindagem = blindagem;
	}
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
	public void exibirArmas() {
		super.exibirInfoGeral();
		System.out.println("Blindagem:      \t "+blindagem);
		poderDeFogo();
	}
	public void poderDeFogo() {
		System.out.println("Poder de Fogo:  \t "+ataque);
	}
	
}
