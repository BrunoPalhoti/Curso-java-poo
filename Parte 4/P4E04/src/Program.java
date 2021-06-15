
public class Program{
    public static void main(String[] args){
        metodoA();
    }
    public static void metodoA(){
        try{
            System.out.println("Método A");
            metodoB();
        }
        catch(Exception e){
            System.out.println("Capiturando erro no método A");
            System.out.println(e.getMessage());
        }
    }
    public static void metodoB() throws Exception {
        System.out.println("Método B");
        metodoC();
    }
    public static void metodoC() throws Exception {
        System.out.println("Método C");
        metodoD();
    }
    public static void metodoD() throws Exception {
        System.out.println("Método D");
        throw new Exception("Lançando a exceção no Método D");
    }
}