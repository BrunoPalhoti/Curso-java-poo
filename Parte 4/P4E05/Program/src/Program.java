import java.util.Scanner;

public class Program{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean c = true;

        do{
            try{
                Integer i;
                System.out.print("Digite um inteiro: ");
                String in = sc.nextLine();
                i = Integer.parseInt(in);
                System.out.println("Você digitou: "+i);
                c = false;
            }
            catch(NumberFormatException e){
                System.out.println("Este não é um número inteiro!");
            }
            catch(Exception e){
                System.out.println("Este não é um número inteiro!");
            }
        }
        while(c);
        sc.close();
    }

    /*public static void main(String[] args){
        metodoA();
    }
    public static void metodoA(){
        try{
            System.out.println("Metodo A");
            metodoB();
        }
        catch(Exception e){
            System.out.println("Capiturando erro no metodo A");
            System.out.println(e.getMessage());
        }
    }
    public static void metodoB() throws Exception {
        System.out.println("Metodo B");
        metodoC();
    }
    public static void metodoC() throws Exception {
        System.out.println("Metodo C");
        metodoD();
    }
    public static void metodoD() throws Exception {
        System.out.println("Metodo D");
        System.out.println("Lancando...");
        throw new Exception("Exceção no Metodo D");
    }*/
}