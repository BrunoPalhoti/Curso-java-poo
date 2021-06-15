package Perfomance;

public class Inicializador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c = new Calculadora();
		
		c.exibeMemoria();
		c.somar(6);
		c.exibeMemoria();
		c.subtrair(2);
		c.exibeMemoria();
		c.multiplicar(2);
		c.exibeMemoria();
		c.dividir(4);
		c.exibeMemoria();
	}

}
