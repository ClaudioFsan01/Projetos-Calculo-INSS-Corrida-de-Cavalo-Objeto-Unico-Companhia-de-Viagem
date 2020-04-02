
public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salario;
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	
	public double calcularInss() {
		
		if(this.salario <= 720.00) {
			return (this.salario * 0.0765);
		}
		else {
			if(this.salario <=1200.00) {
				return (this.salario*0.09);
			}
			else {				
					return (this.salario*0.11);				
			}
				
				
		}
		
		 
	}
	
	

}
