package P5E01.ClassAbstract.SubClass;

import P5E01.ClassAbstract.Class.OperacaoMatematica;

public class Multiplicar extends OperacaoMatematica {
    public double calcular(double x, double y){
        return x * y;
    }
}
