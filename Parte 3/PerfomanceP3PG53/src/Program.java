public class Program {
    public static void main(String[] args){
        //double[] valores = {0,4,5,8,3,6,8,1,0,3};
        double[] valores = {8, 6, 6, 12};
        Estatistica e = new Estatistica(valores);
        e.ordena();
        e.exibirArray();
        System.out.println("\nMédia: "+e.calcularMedia());
        Double[] v = e.calcularModa();
        System.out.print("Moda: ");
        for (int i = 0; i<v.length; i++) {
            if(v[i]!= null) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println("\nMediana: "+e.calcularMediana());
        System.out.printf("Variância: %.2f\n", e.calcularVariancia());
        System.out.printf("Variância populacional: %.2f\n", e.calcularVarianciaPopulacional());
        System.out.printf("Desvio padrão: %.2f\n", e.calcularDesvioPadrao());
    }
}
