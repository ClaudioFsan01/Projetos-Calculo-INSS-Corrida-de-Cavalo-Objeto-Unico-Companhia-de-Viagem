import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String [] args) {
				
		
		Veiculo[] veiculos = new Veiculo[12];
		
		veiculos[0] = new Veiculo(01,"RJ","SP",5,20);
		veiculos[1] = new Veiculo(02,"MG","RS",10,15);
		veiculos[2] = new Veiculo(03,"MS","RO",3,21);
		veiculos[3] = new Veiculo(04,"BA","SE",6,10);
		veiculos[4] = new Veiculo(05,"SC","RJ",1,20);
		veiculos[5] = new Veiculo(06,"AM","AC",0,60);
		veiculos[6] = new Veiculo(07,"AL","CE",20,20);
		veiculos[7] = new Veiculo(8,"RN","RO",9,40);
		veiculos[8] = new Veiculo(9,"RR","GO",14,45);
		veiculos[9] = new Veiculo(10,"RN","PE",1,30);
		veiculos[10] = new Veiculo(11,"SP","BA",30,40);
		veiculos[11] = new Veiculo(12,"SC","ES",0,10);
		
		comprar(veiculos);		
		
	}
	
	public static void comprar(Veiculo [] veiculos) {
		
		int numeroOnibus, quantDesejada;
		
		Scanner sc = new Scanner(System.in);		
		
		do {
			mostrar(veiculos);
			
			System.out.println("\n Deseja comprar uma passagem ? Se sim digite o numero do onibus ou 0 para encerrar :\n");
			 numeroOnibus = sc.nextInt();
			 
			 if(numeroOnibus != 0) {
				 System.out.println("\n Digite a quantidade desejada :\n");
				 quantDesejada = sc.nextInt();
				
				 if(veiculos[numeroOnibus-1].comprar(quantDesejada)==true) {
					 System.out.println(" Compra efetuada com sucesso ! ");
				 }
				 else {
					 System.out.println(" Compra não foi efetuada com sucesso quantidade desejada acima do disponivel ! \n");
				 }
				 
			 }
			
		}while(numeroOnibus !=0);
		
		 System.out.println(" Programa encerrado ! \n");
		
		
	}
	
	public static void mostrar(Veiculo [] veiculos) {
		
		for(int i=0; i< veiculos.length; i++) {
			System.out.println(veiculos[i].getNumVeiculo()+": "+veiculos[i].getEstadoOrigem()+"-"+veiculos[i].getEstadoDestino()+" ("+veiculos[i].getNumAssentosDisponiveis()+
					" assentos disponíveis de "+veiculos[i].getNumAssentos()+")");
		}
	}
	

}
