public class Jogo
{
    private static final int WAITING = 0;
    private static final int PLAYING = 1;
    private static final int ENDED = 2;

    private int estado;
    private int scoreA; // Visitado
    private int scoreB; // Visitante

    public Jogo()
    {
        this.estado = Jogo.WAITING;
        this.scoreA = 0;
        this.scoreB = 0;
    }
    public Jogo(int estado, int scoreA, int scoreB)
    {
        this.estado = estado;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }
    public Jogo(Jogo futebol)
    {
        this.estado = futebol.getEstado();
        this.scoreA = futebol.getScoreA();
        this.scoreB = futebol.getScoreB();
    }

    public int getEstado()
    {
        return this.estado;
    }
    public int getScoreA()
    {
        return this.scoreA;
    }
    public int getScoreB()
    {
        return this.scoreB;
    }
    public void setEstado(int estado)
    {
        this.estado = estado;
    }
    public void setScoreA(int scoreA)
    {
        this.scoreA = scoreA;
    }
    public void setScoreB(int scoreB)
    {
        this.scoreB = scoreB;
    }
    
    public void startGame()
    {
        this.estado = Jogo.PLAYING;
    }
    public void endGame() // *cries*
    {
        this.estado = Jogo.ENDED;
    }
    public void goloVisitado()
    {
        if (this.estado == Jogo.PLAYING)
        {
            this.scoreA++;
        }
        else if (this.estado == Jogo.ENDED)
        {
            System.out.println("O jogo ja acabou! GO HOME!!");
        }
        else if (this.estado == Jogo.WAITING)
        {
            System.out.println("O jogo ainda nem comecou, chill!");
        }
    }
    public void goloVisitante()
    {
        if (this.estado == Jogo.PLAYING)
        {
            this.scoreB++;
        }
        else if (this.estado == Jogo.ENDED)
        {
            System.out.println("O jogo ja acabou! GO HOME!!");
        }
        else if (this.estado == Jogo.WAITING)
        {
            System.out.println("O jogo ainda nem comecou, chill!");
        }
    }
    public String resultadoAtual()
    {
        return "Score: " + this.scoreA + "-" + this.scoreB;
    }
}