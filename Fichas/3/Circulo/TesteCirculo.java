import static java.lang.System.out;

public class TesteCirculo
{
    public static void main(String[] args)
    {
        Circulo teste = new Circulo(0,0,2);
        out.println(teste.toString());
        teste.alteraCentro(1,1);
        out.println(teste.toString());
        out.println("Area = " + teste.calculaArea());
        out.println("Perimetro = " + teste.calculaPerimetro());

        Circulo novoTeste = new Circulo(teste);
        // novoTeste.alteraCentro(2,5);
        // novoTeste.setRaio(5.5);
        out.println(novoTeste);
        out.println("Equals = " + teste.equals(novoTeste));
    }
}