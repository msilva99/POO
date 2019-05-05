import java.util.Scanner;

public class Exemplo1
{
    public static void dizMaior(int i1, int i2)
    {
        if (i1 > i2)
            System.out.println("O maior e " + i1);
        else
            System.out.println("O maior e " + i2);
    }

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.print("Indique dois inteiros: ");

        int a, b;
        a = ler.nextInt();
        b = ler.nextInt();
        dizMaior(a,b);
        ler.close();
    }
}