import java.util.Scanner;
import java.lang.Math;

public class ProgramaPrincipal {

	
    
    public static void main (String[]args) {
    	int k=0, num=0;
        
    	Scanner entrada = new Scanner(System.in);
    	     
    	      
    	    	  Cavalo[] cavalos = new Cavalo[3];
    	    	 
    	    	  for(int i=0; i<3; i++) {
    	    		  cavalos[i] = new Cavalo(i+1);
    	    	  }  	    	 
    	    	 	    	 
    	    		 
    	    	 num = (int)cavalos[k].correr();
    	    		     	    		  
    	    	 while(num != 60) {
    	    		 
    	    		 k = k+1;
    	    		 
    	    		 if(k==3) {
    	    			 k-=3;
    	    		 }    	    
    	    		 
    	    		 if(k<3) {
    	    			 num = (int)cavalos[k].correr();
    	    		 }
    	    				 
    	    		 
    	    	 }   	    	 
    		    	   		   
    		   
    		   System.out.println(cavalos[k].getNome()+ " GANHOU ! ");	  	   	
    	
    }
	
}

