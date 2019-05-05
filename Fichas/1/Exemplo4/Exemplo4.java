import java.util.Scanner;

public class Exemplo4
{
    public static void main(String[] args)
    {
        String resposta;
        int soma, n;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Quantos numeros vai somar? ");
            n = input.nextInt();
            soma = 0;
            for(int i = 0; i < n; i++)
            {
                System.out.print("Valor: ");
                soma += input.nextInt();
            }
            System.out.println("O somatorio e: " + soma);
            System.out.print("Deseja repetir? (y/n)");
            resposta = input.next();
        }
        while (resposta.charAt(0) != 'n');

        input.close();
        System.out.println("Goodbye!");
    }
}