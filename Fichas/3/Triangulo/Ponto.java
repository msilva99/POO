
/**
* Classe que implementa um Ponto num plano2D.
* As coordenadas do Ponto sao inteiras.
*
* @author  MaterialPOO
* @version 20180212
*/
public class Ponto
{
	
	//variaveis de instancia
	private int x;
	private int y;
	
	/**
	* Construtores da classe Ponto.
	* Declaracao dos construtores por omissao (vazio),
	* parametrizado e de copia.
	*/
	
	/**
	* Construtor por omissao de Ponto.
	*/
	public Ponto()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	* Construtor parametrizado de Ponto.
	* Aceita como parametros os valores para cada coordenada.
	*/
	public Ponto(int cx, int cy)
	{
		this.x = cx;
		this.y = cy;
	}
	
	/**
	* Construtor de copia de Ponto.
	* Aceita como parametro outro Ponto e utiliza os metodos
	* de acesso aos valores das variaveis de instancia.
	*/
	public Ponto(Ponto umPonto)
	{
		this.x = umPonto.getX();
		//this.x = umPonto.x;
		this.y = umPonto.getY();
	}
	
	/**
	* metodos de instancia
	*/
	
	/**
	* Devolve o valor da coordenada em x.
	* 
	* @return valor da coordenada x.
	*/
	public int getX()
	{
		return this.x;
	}
	
	/**
	* Devolve o valor da coordenada em y.
	* 
	* @return valor da coordenada y.
	*/
	public int getY()
	{
		return this.y;
	}
	
	/**
	* Actualiza o valor da coordenada em x.
	* 
	* @param novoX novo valor da coordenada em X
	*/
	public void setX(int novoX)
	{
		this.x = novoX;
	}
	
	/**
	* Actualiza o valor da coordenada em y.
	* 
	* @param novoY novo valor da coordenada em Y
	*/
	public void setY(int novoY)
	{
		this.y = novoY;
	}
	
	/**
	* Metodo que desloca um ponto somando um delta as coordenadas
	* em x e y.
	* 
	* @param deltaX valor de deslocamento do x
	* @param deltaY valor de deslocamento do y
	*/
	public void deslocamento(int deltaX, int deltaY)
	{
		this.x += deltaX;
		this.y += deltaY;
	}
	
	/**
	* Metodo que soma as componentes do Ponto passado como parametro.
	* @param umPonto ponto que e somado ao ponto receptor da mensagem.
	*/
	public void somaPonto(Ponto umPonto)
	{
		this.x += umPonto.getX();
		this.y += umPonto.getY();
	}
	
	/**
	* Metodo que move o Ponto para novas coordenadas.
	* @param novoX novo valor de x.
	* @param novoY novo valor de y.
	*/
	public void movePonto(int cx, int cy)
	{
		this.x = cx;  // ou setX(cx)
		this.y = cy;  // ou this.setY(cy)
	}
	
	/**
	* Metodo que determina se o ponto esta no quadrante positivo de x e y
	* @return booleano que e verdadeiro se x>0 e y>0
	*/
	public boolean ePositivo()
	{
		return (this.x > 0 && this.y > 0);
	}
	
	/**
	* Metodo que determina a distancia de um Ponto a outro.
	* @param umPonto ponto ao qual se quer determinar a distancia
	* @return double com o valor da distancia
	*/
	public double distancia(Ponto umPonto)
	{
		return Math.sqrt(Math.pow(this.x - umPonto.getX(), 2) +
						 Math.pow(this.y - umPonto.getY(), 2));
	}
	
	/**
	* Metodo que determina se dois pontos sao iguais.
	* @return booleano que e verdadeiro se os valores das duas 
	* coordenadas forem iguais
	*/
	public boolean iguais(Ponto umPonto)
	{
		return (this.x == umPonto.getX() && this.y == umPonto.getY());
	}   
	
	
	/**
	* Metodo que determina se o modulo das duas coordenadas e o mesmo.
	* @return true, se as coordenadas em x e y 
	* forem iguais em valor absoluto.
	*/
	private boolean xIgualAy()
	{
		return (Math.abs(this.x) == Math.abs(this.y));
	}
	
	/**
	* Metodo que devolve a representacao em String do Ponto.
	* @return String com as coordenadas x e y
	*/
	//public String toString()
	//{
	//  return "Ponto: --> Cx = " + this.x + " -  Cy = " + this.y;
	//}
	
	public boolean equals(Object o)
	{
	if (this == o)
		return true;
	if ((o == null) || (this.getClass() != o.getClass()))
		return false;
	Ponto p = (Ponto) o;
	return (this.x == p.getX() && this.y == p.getY());
	}

	/**
	* Metodo que faz uma copia do objecto receptor da mensagem.
	* Para tal invoca o construtor de copia.
	* 
	* @return objecto clone do objecto que recebe a mensagem.
	*/
	public Ponto clone()
	{
		return new Ponto(this);    
	}    
}