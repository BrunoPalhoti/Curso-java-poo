package Funcionario;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Funcionario 
 * #nome: String 
 * #rg: String 
 * #salarioMensal: double 
 * +aumento(double valor):   void 
 * +pagamento():double
 *
 * @author casa
 */
//Parte 4 pagina 42 ou  pagina 212
public class Funcionario {

    protected String nome;
    protected String rg;
    protected double salarioMensal;

    public Funcionario(String nome, String rg, double salarioMensal){
        this.nome = nome;
        this.rg = rg;
        this.salarioMensal = salarioMensal;

    }

    Funcionario(){

    }

    //Get
    public String getNome(){
        return nome;
    }
    public String getRg(){
        return rg;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }

    //Set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSalarioMensal(double salario){
        this.salarioMensal = salario;
    }


    public void aumento(double valor){
        this.salarioMensal += valor;
    }

    public final double pagamento(){
        return salarioMensal * 0.85;
    }

    public String toString(){
        return "O nome do Funcionário é: " + getNome() +"\n"+
                "O RG do Funcionário é: " + getRg() +"\n"+
                "E o Salário Mensal deste é: " + getSalarioMensal()+"\n";
    }


}
