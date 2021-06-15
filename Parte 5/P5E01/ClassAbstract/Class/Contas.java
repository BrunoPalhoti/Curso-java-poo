package P5E01.ClassAbstract.Class;

public class Contas {
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y){

        System.out.println("O resultado é: " + operacao.calcular(x,y));
    }
}
