
public class Veiculo {
	
	private int numeroVeiculo;
	private String estadoOrigem;
	private String estadoDestino;
	private int capacidadeAssentos;
	private int assentosDisponiveis;
	
	public Veiculo(int numeroVeiculo,String estadoOrigem, String estadoDestino,  int assentosDisponiveis, int capacidadeAssentos) {
		
		this.numeroVeiculo = numeroVeiculo;
		this.estadoOrigem = estadoOrigem;
		this.estadoDestino = estadoDestino;
		this.capacidadeAssentos = capacidadeAssentos;
		this.assentosDisponiveis = assentosDisponiveis;
		
	}
	
	public int getNumVeiculo() {
		return this.numeroVeiculo;
	}
	
	public String getEstadoOrigem() {
		return this.estadoOrigem;
	}
	
	public String getEstadoDestino() {
		return this.estadoDestino;
	}
	
		
	public int getNumAssentosDisponiveis() {
		return this.assentosDisponiveis;
	}
	
	public int getNumAssentos() {
		return this.capacidadeAssentos;
	}
	
	public boolean comprar(int qtdDesejada) {
		if(qtdDesejada<= this.assentosDisponiveis) {
			this.assentosDisponiveis -= qtdDesejada;
			return true;
		}
		else {
			return false;
		}
	}	
      
	

}
