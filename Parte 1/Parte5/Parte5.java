package Parte5;

public class Parte5 {

	private double dp, dg, pp, pm, pg, qtdLitros;

	public Parte5(double dp, double dg, double pp, double pg) {
		super();
		this.dp = dp;
		this.dg = dg;
		this.pp = pp;
		this.pg = pg;
	}

	public double getDp() {
		return dp;
	}

	public void setDp(double dp) {
		this.dp = dp;
	}

	public double getDg() {
		return dg;
	}

	public void setDg(double dg) {
		this.dg = dg;
	}

	public double getPp() {
		return pp;
	}

	public void setPp(double pp) {
		this.pp = pp;
	}

	public double getPm() {
		return pm;
	}

	public void setPm(double pm) {
		this.pm = pm;
	}

	public double getPg() {
		return pg;
	}

	public void setPg(double pg) {
		this.pg = pg;
	}

	public double getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	
	public void quantidadeLitros() {
		pm = (pp +pg)/2;
		qtdLitros = dg*dp*pm*785;
		System.out.println("Quantidade de Litros necessarios para preencher a piscina: " + qtdLitros);
	}
}
