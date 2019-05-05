import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero de inteiros a ler: ");
        int n = input.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        if (n > 0)
        {
            int min = array[0];
            for(int i = 1; i < array.length; i++)
            {
                if (array[i] < min)
                {
                    min = array[i];
                }
            }
            System.out.println("O minimo e " + min);
        }

        input.close();
    }
}