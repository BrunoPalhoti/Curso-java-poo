package Funcionario;

/**
 *Chefe
*#contas: double
#gastosExtras: double
#adicionalChefia: double
+pagamentoExtra():double
 * @author casa
 */
//Parte 4 pagina 42 ou  pagina 212
public class Chefe extends Funcionario{
    protected double contas;
    protected double gastosExtra;
    protected double adicionalChefia;

    public Chefe(String nome, String rg, double salarioMensal,
                 double contas, double gastosExtra, double adicionalChefia){
        super(nome,rg,salarioMensal);
        this.contas = contas;
        this.gastosExtra = gastosExtra;
        this.adicionalChefia = adicionalChefia;

    }
    //GET


    public double getContas() {
        return contas;
    }

    public double getGastosExtra() {
        return gastosExtra;
    }

    public double getAdicionalChefia() {
        return adicionalChefia;
    }

    //SET

    public void setContas(double contas) {
        this.contas = contas;
    }
    public void setGastosExtra(double gastosExtra){

    }
    public void setAdicionalChefia(double adicionalChefia){

    }

    //Métodos

    public double pagamentoExtra(){
        return contas+pagamento()+gastosExtra+adicionalChefia;
    }

    public String toString(){
        return "O nome do Funcionário é: " + getNome() +
                " O RG do Funcionário é: " + getRg() +
                " E o Salário Mensal deste é: " + getSalarioMensal() +
                " A conta é: " + getContas() +
                "O gasto Extra é: " + getGastosExtra() +
                "O adcional do Chefe: " + getAdicionalChefia();

    }

}

