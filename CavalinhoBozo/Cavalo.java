import java.util.Random;
import java.util.Scanner;

public class Cavalo {
	
	private String nome;
	private String avatar;	
	private double distanciaPercorrida=0.00;
	
	public Cavalo(int n) {		
		
		if(n==1) {
			System.out.println(" Nome do cavalo : (1-PRETINHO) \n"); 
			this.nome = "PRETINHO";	
			this.avatar = "P>";
			
		}
		else {
			if(n==2) {
				System.out.println(" Nome do cavalo : (2-BRANQUINHO) \n"); 
				 this.nome = "BRANQUINHO";	
					this.avatar = "B>";
					
			}
			else {			
					System.out.println(" Nome do cavalo :  (3-MALHADINHO) \n"); 
					 this.nome = "MALHADINHO";	
						this.avatar = "M>";	
						
				
			}
			
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double correr() {
		 
		this.distanciaPercorrida += (double)Math.random();		
		
		mostrar(this.distanciaPercorrida);	
		
		return this.distanciaPercorrida;
		
	}
	
	private void mostrar(double distanciaPercorrida) {		
		
       int n = (int)distanciaPercorrida;		
		String espaco = gerarDistancia(n);
		
		System.out.println(this.nome+":"+espaco+this.avatar);
		
		if(this.nome == "MALHADINHO") {
              for(int i=0; i<25; i++) {
            	  System.out.println("\n");
              }
		}
			
	}
	
	public String gerarDistancia(int n) {
		String espaco="";
		
		for(int i=0; i<n; i++) {
			espaco +=" ";
		}
		
		return espaco;
	}
	
	
	
	
	

}
