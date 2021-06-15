

public class P3E05 {
    boolean[] array = {true,true,true,true,true,true,true,true,true,true,
            true,true,true,true,true,true,true,true,true,true};


    public void calcular(){
        int cont;
        for(int i = 0; i < array.length; i++){
            cont = 0;
            if(i==0 || i==1){
                array[i] = false;
            }
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont > 2){
                array[i] = false;
            }
        }
    }
    public void exibir(){
        for(int i = 0; i<array.length; i++){
            System.out.println(i+" ["+array[i]+"]");
        }
    }
}
