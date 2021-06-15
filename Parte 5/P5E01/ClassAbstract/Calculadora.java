package P5E01.ClassAbstract;

import P5E01.ClassAbstract.Class.Contas;
import P5E01.ClassAbstract.Class.Metodos;
import P5E01.ClassAbstract.SubClass.Dividir;
import P5E01.ClassAbstract.SubClass.Multiplicar;
import P5E01.ClassAbstract.SubClass.Soma;
import P5E01.ClassAbstract.SubClass.Subtrair;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int valor = 0;

System.out.println("Valores Padrões 100 e 5");
        Contas contas = new Contas();
        System.out.println("Soma:");
        contas.mostrarCalculo(new Soma(),100,5);
        System.out.println("Subtrair:");
        contas.mostrarCalculo(new Subtrair(),100,5);
        System.out.println("Dividir:");
        contas.mostrarCalculo(new Dividir(),100,5);
        System.out.println("Multiplicar:");
        contas.mostrarCalculo(new Multiplicar(),100,5);

        System.out.println("------------------------------------------------------------------------\n");

        System.out.println("Deseja 1-Somar, 2-Subtrair, 3-Dividir, 4-Multiplicar");
        Metodos metodos = new Metodos();
        valor = entrada.nextInt();
        metodos.escolhaOpcao(valor);

        entrada.close();

    }
}
