
public class Unica {
	
	private static Unica unicaInstancia;
	
	private Unica() { // método construtor privado não permite que essa classe seja instanciada
		
	}
	
	public static synchronized Unica pegaInstancia() { // a palavra synchronized impede criar duas instâncias da classe num determinado momento. Caso não utilizassemos essa palavra  verificaríamos que isso é possível. 
		
		if(unicaInstancia==null) { // essa verificação garante que apenas um objeto seja instanciado 
			unicaInstancia = new Unica(); 
		}
		
		return unicaInstancia;
	}

}
// fonte de pesquisa : https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392