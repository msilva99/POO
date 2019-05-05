import java.util.ArrayList;

public class TesteTelemovel
{
    public static void main(String[] args)
    {
        ArrayList<String> msg = new ArrayList<String>();
        ArrayList<String> apps = new ArrayList<String>();
        Telemovel teste = new Telemovel("Marca",
                                        "Modelo",
                                        6,
                                        12,
                                        msg,
                                        1000,
                                        400,
                                        350,
                                        750,
                                        20,
                                        7,
                                        apps);
        
        teste.instalaApp("valid", 200);
        teste.instalaApp("invalid", 200);
        System.out.println("Tamanho medio por app: " + teste.tamMedioApps());
        teste.recebeMsg("blabla1");
        teste.recebeMsg("blabla12");
        teste.recebeMsg("blabla123");
        teste.recebeMsg("blabla23");
        System.out.println("Maior mensagem: " + teste.maiorMsg());
        teste.removeApp("valid", 200);
        teste.instalaApp("new", 200);
    }
}