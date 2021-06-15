package Parte1;

public class Inicializador {

	public static void main(String[] args) {
		
		// criando dois funcionários
		Funcionario F01 = new Funcionario();
		Funcionario F02 = new Funcionario(1105,"Jose Carlos Silva",6500.00);
		
		F01.setCodFunc(1200);
		F01.setNomeFunc("Maria Antonia Guimarães");
		F01.setSalarioMensal(8600.00);

		// exibindo seus atributos
		System.out.println("Cogigo Funcionario: " + F01.getCodFunc() + "\t\tNome:" + F01.getNomeFunc() + "\t\tSalario Mensal: R$" + F01.getSalarioMensal());
		System.out.println("Cogigo Funcionario: " + F02.getCodFunc() + "\t\tNome:" + F02.getNomeFunc() + "\t\tSalario Mensal: R$" + F02.getSalarioMensal());
		
		// aumentando os salários em 15%
		F01.setAumento(15.0);
		F02.setAumento(15.0);
		
		// exibindo salario anual
		System.out.println("Cogigo Funcionario: " + F01.getCodFunc()+ "\t\tSalario Anual: R$" +F01.getSalarioAnual());
		System.out.println("Cogigo Funcionario: " + F02.getCodFunc()+ "\t\tSalario Anual: R$" +F02.getSalarioAnual());
	}

}
