package P5E01.ClassAbstract.Class;

import P5E01.ClassAbstract.SubClass.Dividir;
import P5E01.ClassAbstract.SubClass.Multiplicar;
import P5E01.ClassAbstract.SubClass.Soma;
import P5E01.ClassAbstract.SubClass.Subtrair;

import java.util.Scanner;

public class Metodos {

    public void escolhaOpcao(int numero){
        Scanner ler = new Scanner(System.in);
        Contas contas = new Contas();

        double numeroUm = 0;
        double numeroDois = 0;
        //double resultado = 0;

        switch (numero){
            case 1:
                System.out.println("Soma: Digite dois Números:");
                numeroUm  = Double.parseDouble(ler.nextLine());
                numeroDois = Double.parseDouble(ler.nextLine());

                contas.mostrarCalculo(new Soma(),numeroUm, numeroDois);
                break;

                case 2:
                    System.out.println("Subtrair: Digite dois Números:");
                    numeroUm  = Double.parseDouble(ler.nextLine());
                    numeroDois = Double.parseDouble(ler.nextLine());

//                    Contas contas = new Contas();
                    contas.mostrarCalculo(new Subtrair(),numeroUm, numeroDois);
                break;
            case 3:
                System.out.println("Dividr: Digite dois Números:");
                numeroUm  = Double.parseDouble(ler.nextLine());
                numeroDois = Double.parseDouble(ler.nextLine());

                //Contas contas = new Contas();
                contas.mostrarCalculo(new Dividir(),numeroUm, numeroDois);
                break;
            case 4:
                System.out.println("Multiplicar: Digite dois Números:");
                numeroUm  = Double.parseDouble(ler.nextLine());
                numeroDois = Double.parseDouble(ler.nextLine());

                //Contas contas = new Contas();
                contas.mostrarCalculo(new Multiplicar(),numeroUm, numeroDois);
                break;
            default: Runtime.getRuntime().exit(0);
                break;

        }

    }
}
