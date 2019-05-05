public class Circulo
{
    
/**
* Classe que implementa um Circulo num plano 2D.
*
* @author  Maria Silva
* @version 20190502
*/

	//variaveis de instancia
	private double x;
	private double y;
	private double raio;
	
	/**
	* Construtores da classe Circulo.
	* Declaracao dos construtores por omissao (vazio),
	* parametrizado e de copia.
	*/
	
	/**
	* Construtor por omissao de Circulo.
	*/
	public Circulo()
	{
		this.x = 0;	
		this.y = 0;	
		this.raio = 0;	
	}
	
	/**
	* Construtor parametrizado de Circulo.
	* Aceita como parametros os valores para cada coordenada.
	*/
	public Circulo(double cx, double cy, double craio)
	{
		this.x = cx;
		this.y = cy;
		this.raio = craio;
	}
	
	/**
	* Construtor de copia de Circulo.
	* Aceita como parametro outro Circulo e utiliza os metodos
	* de acesso aos valores das variaveis de instancia.
	*/
	public Circulo(Circulo umCirculo)
	{
		this.x = umCirculo.getX();
		this.y = umCirculo.getY();
		this.raio = umCirculo.getRaio();
	}
	
	/**
	* metodos de instancia
	*/
	
	/**
	* Devolve o valor da coordenada em x.
	* 
	* @return valor da coordenada x.
	*/
	public double getX()
	{
		return this.x;
	}
	
	/**
	* Devolve o valor da coordenada em y.
	* 
	* @return valor da coordenada y.
	*/
	public double getY()
	{
		return this.y;
	}

	/**
	* Devolve o valor do raio.
	* 
	* @return valor do raio.
	*/
	public double getRaio()
	{
		return this.raio;
	}
	
	/**
	* Actualiza o valor da coordenada em x.
	* 
	* @param novoX novo valor da coordenada em X
	*/
	public void setX(double novoX)
	{
		this.x = novoX;
	}
	
	/**
	* Actualiza o valor da coordenada em y.
	* 
	* @param novoY novo valor da coordenada em Y
	*/
	public void setY(double novoY)
	{
		this.y = novoY;
	}

	/**
	* Actualiza o valor da coordenada em y.
	* 
	* @param novoRaio novo valor da coordenada em Y
	*/
	public void setRaio(double novoRaio)
	{
		this.raio = novoRaio;
	}
	
	/**
	* Metodo que altera o posicionamento do circulo.
	*/	
	public void alteraCentro(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	* Metodo que calcula a area do circulo.
	*/
	public double calculaArea()
	{
		return (Math.PI * Math.pow(this.raio, 2));
	}

	/**
	* Metodo que calcula o perimetro do circulo.
	*/
	public double calculaPerimetro()
	{
		return (2 * Math.PI * this.raio);
	}
	
	// Nao tendi (?) copiei do Ponto.java
	public boolean equals(Object o)
	{
		if (this == o)
		return true;
		if ((o == null) || (this.getClass() != o.getClass()))
		return false;
		Circulo p = (Circulo) o;
		return (this.x == p.getX() && this.y == p.getY() && this.raio == p.getRaio());
	}
	
	/**
	* Metodo que devolve a representacao em String do Circulo.
	* @return String com as coordenadas x e y
	*/
	public String toString()
	{
		return "Circulo: --> x = " + this.x + ", y = " + this.y + ", Raio = " + this.raio;
	}
	
	/**
	* Metodo que faz uma copia do objecto receptor da mensagem.
	* Para tal invoca o construtor de copia.
	* 
	* @return objecto clone do objecto que recebe a mensagem.
	*/
	public Circulo clone()
	{
		return new Circulo(this);    
	}
}