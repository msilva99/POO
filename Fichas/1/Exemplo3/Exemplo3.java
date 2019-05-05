import java.util.Scanner;

public class Exemplo3
{    
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Valor: ");
            soma += input.nextInt();
        }
        System.out.println("O somatorio e: " + soma);
        input.close();
    }
}