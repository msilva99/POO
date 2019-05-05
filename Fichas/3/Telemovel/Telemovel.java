import java.util.ArrayList;

public class Telemovel
{
    //variaveis de instancia
    private String marca;
    private String modelo;
    private int x;
    private int y;
    private ArrayList<String> mensagens;
    private int armz_total;
    private int armz_fotos;
    private int armz_apps;
    private int espaco_ocupado; // em bytes
    private int n_fotos;
    private int n_apps;
    private ArrayList<String> nome_apps;
    
    /**
    * Construtores da classe Telemovel.
    * Declaracao dos construtores por omissao (vazio),
    * parametrizado e de copia.
    */
    
    /**
    * Construtor por omissao de Telemovel.
    */
    public Telemovel()
    {
        this.marca = "";
        this.modelo = "";
        this.x = 0;
        this.y = 0;
        this.mensagens = new ArrayList<String>();
        this.armz_total = 0;
        this.armz_fotos = 0;
        this.armz_apps = 0;
        this.espaco_ocupado = 0; // em bytes (?)
        this.n_fotos = 0;
        this.n_apps = 0;
        this.nome_apps = new ArrayList<String>();
    }
    
    /**
    * Construtor parametrizado de Telemovel.
    * Aceita como parametros os valores para cada coordenada.
    */
    public Telemovel(String marca,
                     String modelo,
                     int x,
                     int y,
                     ArrayList<String> mensagens,
                     int armz_total,
                     int armz_fotos,
                     int armz_apps,
                     int espaco_ocupado,
                     int n_fotos,
                     int n_apps,
                     ArrayList<String> nome_apps)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.mensagens = mensagens;
        this.armz_total = armz_total;
        this.armz_fotos = armz_fotos;
        this.armz_apps = armz_apps;
        this.espaco_ocupado = espaco_ocupado; // em bytes (?)
        this.n_fotos = n_fotos;
        this.n_apps = n_apps;
        this.nome_apps = nome_apps;
    }
    
    /**
    * Construtor de copia de Telemovel.
    * Aceita como parametro outro Telemovel e utiliza os metodos
    * de acesso aos valores das variaveis de instancia.
    */
    public Telemovel(Telemovel umTelemovel)
    {
        this.marca = umTelemovel.getMarca();
        this.modelo = umTelemovel.getModelo();
        this.x = umTelemovel.getX();
        this.y = umTelemovel.getY();
        this.mensagens = umTelemovel.getMensagens();
        this.armz_total = umTelemovel.getArmz_total();
        this.armz_fotos = umTelemovel.getArmz_fotos();
        this.armz_apps = umTelemovel.getArmz_apps();
        this.espaco_ocupado = umTelemovel.getEspaco_ocupado(); // em bytes (?)
        this.n_fotos = umTelemovel.getN_fotos();
        this.n_apps = umTelemovel.getN_apps();
        this.nome_apps = umTelemovel.getNome_apps();
    }
    
    /**
    * metodos de instancia
    */
    
    public String getMarca()
    {
        return this.marca;
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public ArrayList<String> getMensagens()
    {
        return this.mensagens;
    }

    public int getArmz_total()
    {
        return this.armz_total;
    }

    public int getArmz_fotos()
    {
        return this.armz_fotos;
    }

    public int getArmz_apps()
    {
        return this.armz_apps;
    }

    public int getEspaco_ocupado()
    {
        return this.espaco_ocupado;
    }

    public int getN_fotos()
    {
        return this.n_fotos;
    }

    public int getN_apps()
    {
        return this.n_apps;
    }

    public ArrayList<String> getNome_apps()
    {
        return this.nome_apps;
    }

    public boolean existeEspaco(int numeroBytes)
    {
        return (espaco_ocupado + numeroBytes < armz_total);
    }
    
    public void instalaApp(String nome, int tamanho)
    {
        if (existeEspaco(tamanho))
        {
            this.armz_apps += tamanho;
            this.espaco_ocupado += tamanho;
            this.n_apps++;
            this.nome_apps.add(nome);
        }
        else
        {
            System.out.println("Espaco insuficiente!");
        }
    }

    public void recebeMsg(String msg)
    {
        this.mensagens.add(msg);
    }

    public double tamMedioApps()
    {
        return ((double)this.armz_apps / this.n_apps);
    }

    public String maiorMsg()
    {
        int x;
        int ind = 0;
        int maior = 0;
        int n_msg = this.mensagens.size();
        for(int i = 0; i < n_msg; i++)
        {
            x = this.mensagens.get(i).length();
            if (x > maior)
            {
                ind = i;
                maior = x;
            }
        }
        return this.mensagens.get(ind);
    }

    public void removeApp(String nome, int tamanho)
    {
        this.armz_apps -= tamanho;
        this.espaco_ocupado -= tamanho;
        this.n_apps--;
        this.nome_apps.remove(this.nome_apps.indexOf(nome));
    }
}