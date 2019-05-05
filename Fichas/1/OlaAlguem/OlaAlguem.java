public class OlaAlguem
{
    public static String geraSaudacao(String nome)
    {
        return "Ola " + nome + "!";
    }
    public static void main(String[] args)
    {
        String saudacao = geraSaudacao("Mundo");
        System.out.println(saudacao);
    }
}