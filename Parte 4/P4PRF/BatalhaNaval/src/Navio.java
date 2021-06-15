
public abstract class Navio {
	protected int numTripulantes;
	protected String nome;
	
	public Navio(int numTripulantes, String nome) {
		this.numTripulantes = numTripulantes;
		this.nome = nome;
	}
	public int getNumTripulantes() {
		return numTripulantes;
	}
	public String getNome() {
		return nome;
	}
	///////
	public void setNumTripulantes(int numTripulantes) {
		this.numTripulantes = numTripulantes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirInfoGeral() {
		System.out.println("Nome do Navio:  \t "+nome);
		System.out.println("Num Tripilantes:\t "+numTripulantes);
	}
	
	
}
