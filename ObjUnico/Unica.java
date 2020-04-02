
public class Unica {
	
	private static Unica unicaInstancia;
	
	private Unica() { // m�todo construtor privado n�o permite que essa classe seja instanciada
		
	}
	
	public static synchronized Unica pegaInstancia() { // a palavra synchronized impede criar duas inst�ncias da classe num determinado momento. Caso n�o utilizassemos essa palavra  verificar�amos que isso � poss�vel. 
		
		if(unicaInstancia==null) { // essa verifica��o garante que apenas um objeto seja instanciado 
			unicaInstancia = new Unica(); 
		}
		
		return unicaInstancia;
	}

}
// fonte de pesquisa : https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392