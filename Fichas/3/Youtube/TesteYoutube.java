public class TesteYoutube
{
    public static void main(String[] args)
    {
        Youtube teste = new Youtube();
        teste.setNome("Novo Video");
        teste.setResolucao(720);
        int[] duracao = new int[2];
        duracao[0] = 6;
        duracao[1] = 66;
        teste.setDuracao(duracao);
        teste.insereComentario("This is a comment");
        teste.insereComentario("Good video");
        teste.insereComentario("Idfk");
        teste.insereComentario("What am I doing with my life :)");
        int[] contador = new int[2];
        contador[0] = 660;
        contador[1] = 27;
        teste.setContador(contador);
        for(int i = 0; i < 6; i++)
            teste.thumbsUp();
        System.out.print(teste.toString());
    }
}