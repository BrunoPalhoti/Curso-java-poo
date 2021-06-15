import java.util.Scanner;

public class CD extends Midia {
	private int nMusica;

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CD(int c, double p, String n, int m) {
		super(c, p, n);
		this.nMusica = m;
	}

	public int getnMusica() {
		return nMusica;
	}

	public void setMusica(int m) {
		this.nMusica =  m;
	}
	
	public String getDetalhe() {
		return super.getDetalhe() + "\nNumero Musica: " +getnMusica()+ 
				"\n================";
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);

		 System.out.printf("\nNumero Musica: ");
		 int musica = sc.nextInt();
		 setMusica(musica);
		
	}
}