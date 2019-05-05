public class TesteTriangulo
{
    public static void main(String[] args)
    {
        Ponto a = new Ponto(1,1);
        Ponto b = new Ponto(3,4);
        Ponto c = new Ponto(4,2);
        Triangulo teste = new Triangulo(a,b,c);
        System.out.println("Area = " + teste.calculaAreaTriangulo());
        System.out.println("Perimetro = " + teste.calculaPerimetroTriangulo());
    }
}