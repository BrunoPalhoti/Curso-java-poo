import java.util.Scanner;

public class DVD extends Midia {
private int nFaixa;
	
	public DVD() {
	super();
	}

	public DVD(int c, double p, String n, int f) {
	super(c, p, n);
	this.nFaixa = f;
	}

	public int getnFaixa() {
		return nFaixa;
	}

	public void setFaixa(int f) {
		this.nFaixa = f;
	}
	
	public String getDetalhe() {
		return super.getDetalhe() + "\nFaixa: " +getnFaixa()+ 
				"\n================";
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);

		 System.out.printf("\nFaixa: ");
		 int faixa = sc.nextInt();
		 setFaixa(faixa);
		
	}
}
