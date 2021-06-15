import java.util.Scanner;

public class Midia{
	protected int 	 codigo;
	protected double preco;
	protected String nome;
	
	public Midia() {
		
	}
	
	public Midia(int c, double p, String n) {
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		String tipo = this.getClass().toString();
		return tipo;
	}

	public String getDetalhe() {
		return "Tipo: " + getTipo() + "\nCodigo: " + getCodigo() +
				"\nNome: " + getNome() + "\nPreço: " + getPreco();
	}

	public void inserirDados() {
		Scanner sc = new Scanner(System.in);

		 System.out.printf("\nInformeo nome: ");
		 String nome = sc.nextLine();
		 setNome(nome);
		
		 System.out.printf("\nInforme o codigo: ");
		 int cod = sc.nextInt();
		 setCodigo(cod);
		 
		 System.out.printf("\nInformeo preco: ");
		 double preco = sc.nextDouble();
		 setPreco(preco);
		
	}
	public void printDados() {
		System.out.println(getDetalhe());
	}

}
