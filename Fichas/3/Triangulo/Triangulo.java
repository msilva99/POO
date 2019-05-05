public class Triangulo
{
    private Ponto a;
    private Ponto b;
    private Ponto c;
    
    public Triangulo()
    {
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
    }
    public Triangulo(Ponto a, Ponto b, Ponto c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangulo(Triangulo x)
    {
        this.a = x.getA();
        this.b = x.getB();
        this.c = x.getC();
    }

    public Ponto getA()
    {
        return this.a;
    }
    public Ponto getB()
    {
        return this.b;
    }
    public Ponto getC()
    {
        return this.c;
    }

    public void setA(Ponto a)
    {
        this.a = a;
    }
    public void setB(Ponto b)
    {
        this.b = b;
    }
    public void setC(Ponto c)
    {
        this.c = c;
    }
    
    public double calculaAreaTriangulo()
    {
        double ab = this.a.distancia(this.b);
        double bc = this.b.distancia(this.c);
        double ac = this.a.distancia(this.c);

        double p = (ab + bc + ac) / 2;
        return (Math.sqrt(p*(p - ab)*(p - bc)*(p - ac)));
    }
    public double calculaPerimetroTriangulo()
    {
        double ab = this.a.distancia(this.b);
        double bc = this.b.distancia(this.c);
        double ac = this.a.distancia(this.c);
        return ab + bc + ac;
    }
}