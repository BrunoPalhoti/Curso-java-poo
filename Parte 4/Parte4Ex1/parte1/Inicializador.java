package parte1;

import java.util.Date;

public class Inicializador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa a = new Aluno();
		Funcionario f = new Funcionario();
		Pessoa pr = new Professor();
		Date d = new Date();
	
		f.setDataAdmissao(d);
		System.out.println(f.getDataAdmissao());

		System.out.println(a.tiraCopias(5));
		System.out.println(f.tiraCopias(5));
		System.out.println(pr.tiraCopias(5));
	}
}
