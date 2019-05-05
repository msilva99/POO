public class TesteJogo
{
    public static void main(String[] args)
    {
        Jogo teste = new Jogo();
        System.out.println(teste.resultadoAtual());
        teste.goloVisitado();
        teste.startGame();
        teste.goloVisitado();
        teste.goloVisitante();
        teste.goloVisitado();
        System.out.println(teste.resultadoAtual());
        teste.goloVisitante();
        teste.goloVisitado();
        teste.endGame(); // *cries again*
        System.out.println(teste.resultadoAtual());
        teste.goloVisitado();
    }
}