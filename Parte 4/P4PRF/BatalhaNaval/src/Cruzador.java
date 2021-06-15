
public class Cruzador extends NavioDeGuerra {
	protected int numCanhoes;

	public Cruzador(int numTripulantes,
					String nome,
					double blindagem,
					double ataque,
					int numCanhoes) {
		super(numTripulantes, nome, blindagem, ataque);
		this.numCanhoes = numCanhoes;
	}

	public int getNumCanhoes() {
		return numCanhoes;
	}
	public void setNumCanhoes(int numCanhoes) {
		this.numCanhoes = numCanhoes;
	}

	public void poderDeFogo() {
		double pf = ataque * Math.sqrt(numCanhoes);
		System.out.println("Poder de Fogo:  \t "+pf);
	}
}
