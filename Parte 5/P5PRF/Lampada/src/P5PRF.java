import java.util.Scanner;

public class P5PRF {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean c = true;

        System.out.println("Escolha o tipo de lâmpada.");
        System.out.println("1) Incandescente\n2) Fluorescente\n3) LED\n");
        do{
            try{
                Integer i;
                System.out.print("Digite o numero correspondente: ");
                String in = sc.nextLine();
                i = Integer.parseInt(in);
                ILampada l = FabricaLampada.construir(i);
                l.ligar();
                l.desligar();
                c = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite um n° correspondente às opções");
            }
            catch(Exception e){
                System.out.println("Digite um n° correspondente às opções");
            }
        }
        while(c);
        sc.close();
    }
}
