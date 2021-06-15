

public class FabricaLampada {
    static private class Incandescente implements ILampada{
        @Override public void ligar(){
            exibeMensagem("incandecente", true);
        }
        @Override public void desligar(){
            exibeMensagem("incandecente", false);
        }
    }
    static private class Fluorescente implements ILampada{
        @Override public void ligar(){
            exibeMensagem("fluorescente", true);
        }
        @Override public void desligar(){
            exibeMensagem("fluorescente", false);
        }
    }
    static private class LED implements ILampada{
        @Override public void ligar(){
            exibeMensagem("de LED", true);
        }
        @Override public void desligar(){
            exibeMensagem("de LED", false);
        }
    }
    private static void exibeMensagem(String msg, boolean isOn){
        if(isOn){
            System.out.println(" * Liguei a lâmpada "+msg);
        }
        else{
            System.out.println(" * Desliguei a lâmpada "+msg);
        }
    }
    public static ILampada construir(int tipo) throws Exception {
        if(tipo < 1 || tipo > 3){
            throw new Exception();
        }
        ILampada lampada = null;
        switch (tipo) {
            case 1 :
                lampada =  new Incandescente();
                break;
            case 2 :
                lampada = new Fluorescente();
                break;
            case 3 :
                lampada =  new LED();
                break;
        }
        return lampada;
    }
}
