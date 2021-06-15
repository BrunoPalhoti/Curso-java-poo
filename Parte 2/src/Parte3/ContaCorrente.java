package Parte3;

public class ContaCorrente {
	private int 	nunCC;
	private double 	saldoCC;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int nunCC) {
		super();
		this.nunCC = nunCC;
	}

	public int getNunCC() {
		return nunCC;
	}

	public void setNunCC(int nunCC) {
		this.nunCC = nunCC;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void depositar(double valor) {
		double aux   = getSaldoCC() + valor;
		this.saldoCC = aux;
		System.out.println("Valor depositado na Conta Corrente "+ getNunCC() + ": R$ " + valor);
	}
	public void sacar(double valor) {
		double aux   = getSaldoCC() - valor;
		this.saldoCC = aux;
		System.out.println("Valor Sacado da Conta Corrente "+ getNunCC() + ": R$ " + valor);
		System.out.println("Saldo depois de sacar da Conta Corrente "+ getNunCC() + ": R$ " + getSaldoCC());
	}
}
