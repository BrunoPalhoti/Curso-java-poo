
public class Estatistica {
    private double[] valores;
    private boolean ordenado = false;
    public Estatistica(double[] v){
        setValores(v);
    }
    //Getters
    public double[] getValores(){
        return valores;
    }
    //Setters
    public void setValores(double[] valores){
        this.valores = valores;
    }
    // 0  3  4  5  8  5
    //[0][1][2][3][4][5]
    public void ordena(){
        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                if(i != j){
                    if(valores[j] > valores[i]){
                        double aux = valores[j];
                        valores[j] = valores[i];
                        valores[i] = aux;
                    }
                }
            }
        }
        ordenado = true;
    }
    public double calcularMediana(){
        double valorRetorno = 0;
        if(!ordenado){
            ordena();
        }
        if(valores.length % 2 == 0){
            int meio = valores.length / 2;
            int meio2 = meio-1;

            valorRetorno = (valores[meio]+valores[meio2])/2;
        }
        else{
            int meio = (int)Math.ceil(valores.length / 2);
            valorRetorno = valores[meio];
        }
        return valorRetorno;
    }
    public Double[] calcularModa(){
        double moda = 0;
        int comparaV = 0;
        int qtdModas=0;
        int numeroDeOcorrencias;

        Double[] modas = new Double[valores.length];

        for (int p = 0; p < valores.length; p++) {
            numeroDeOcorrencias = 1;
            for (int k = p + 1; k < valores.length; k++) {
                if (valores[p] == valores[k]) {
                    ++numeroDeOcorrencias;
                }
            }
            if (numeroDeOcorrencias > comparaV) {
                moda = valores[p];
                modas[qtdModas]=moda;
                comparaV = numeroDeOcorrencias;
            }
            else if(numeroDeOcorrencias == comparaV){
                qtdModas++;
                modas[qtdModas]=valores[p];
            }
        }
        return modas;
    }
    public double calcularMedia(){
        double somatoria = 0;
        for (double v : valores) {
            somatoria += v;
        }
        return somatoria/valores.length;
    }
    public double calcularVariancia(){
        double media = calcularMedia();
        double somatoria = 0;
        for(int i = 0; i< valores.length; i++){
            //if(valores[i] > media){
            somatoria += Math.pow(valores[i]-media, 2);
        }
        return somatoria / (valores.length-1);
    }
    public double calcularVarianciaPopulacional(){
        double media = calcularMedia();
        double somatoria = 0;
        for(int i = 0; i< valores.length; i++){
            //if(valores[i] > media){
            somatoria += Math.pow(valores[i]-media, 2);
        }
        return somatoria / valores.length;
    }
    public double calcularDesvioPadrao(){
        return Math.sqrt(calcularVariancia());
    }
    public void exibirArray(){
        for(int i = 0; i<valores.length; i++){
            System.out.print("["+valores[i]+"]");
        }
    }
}
