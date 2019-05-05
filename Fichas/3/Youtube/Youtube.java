import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.Byte;
import java.time.temporal.ChronoUnit;

public class Youtube
{
    private String nome;
    private ArrayList<Byte> conteudo;
    private LocalDate data;
    private int resolucao;
    private int[] duracao; // duracao[0] = min
                            // duracao[1] = seg
    private ArrayList<String> comentarios;
    private int[] contador; // contador[0] = likes
                            // contador[1] = dislikes
    
    public Youtube()
    {
        this.nome = "";
        this.conteudo = new ArrayList<Byte>();
        this.data = LocalDate.now();
        this.resolucao = 0;
        int[] duracao = new int[2];
        duracao[0] = 0;
        duracao[1] = 0;
        this.duracao = duracao;
        this.comentarios = new ArrayList<String>();
        int[] contador = new int[2];
        contador[0] = 0;
        contador[1] = 0;
        this.contador = contador;
    }
    public Youtube(String nome,
                   ArrayList<Byte> conteudo,
                   LocalDate data,
                   int resolucao,
                   int[] duracao,
                   ArrayList<String> comentarios,
                   int[] contador)
    {
        this.nome = nome;
        this.conteudo = conteudo;
        this.data = data;
        this.resolucao = resolucao;
        this.duracao = duracao;
        this.comentarios = comentarios;
        this.contador = contador;
    }
    public Youtube(Youtube video)
    {
        this.nome = video.getNome();
        this.conteudo = video.getConteudo();
        this.data = video.getData();
        this.resolucao = video.getResolucao();
        this.duracao = video.getDuracao();
        this.comentarios = video.getComentarios();
        this.contador = video.getContador();
    }
    
    public String getNome()
    {
        return this.nome;
    }
    public ArrayList<Byte> getConteudo()
    {
        return this.conteudo;
    }
    public LocalDate getData()
    {
        return this.data;
    }
    public int getResolucao()
    {
        return this.resolucao;
    }
    public int[] getDuracao()
    {
        return this.duracao;
    }
    public ArrayList<String> getComentarios()
    {
        return this.comentarios;
    }
    public int[] getContador()
    {
        return this.contador;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setConteudo(ArrayList<Byte> conteudo)
    {
        this.conteudo = conteudo;
    }
    public void setData(LocalDate data)
    {
        this.data = data;
    }
    public void setResolucao(int resolucao)
    {
        this.resolucao = resolucao;
    }
    public void setDuracao(int[] duracao)
    {
        this.duracao = duracao;
    }
    public void setComentarios(ArrayList<String> comentarios)
    {
        this.comentarios = comentarios;
    }
    public void setContador(int[] contador)
    {
        this.contador = contador;
    }

    public void insereComentario(String comentario)
    {
        this.comentarios.add(comentario);
    }
    public long qtsDiasDepois()
    {
        return ChronoUnit.DAYS.between(this.data, LocalDate.now());
    }
    public void thumbsUp()
    {
        this.contador[0]++;
    }
    public String toString()
    {
        String info = "Nome: " + this.nome + "\nData: " + this.data + "\nResolucao: " + this.resolucao + "\nDuracao: " + this.duracao[0] + ":" + this.duracao[1] + "\n-- Comentarios: --\n" + this.comentarios + "\n--- --- ---\n" + "Likes: " + this.contador[0] + "\nDislikes: " + this.contador[1];
        return info + "\n";
    }
}