
public class Inicializador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Midia m   = new Midia();
		Midia dvd = new DVD();
		Midia cd  = new CD();
		
		
		dvd.inserirDados();
		dvd.printDados();
		cd.inserirDados();
		cd.printDados();
	}

}
