import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		 int  qtdFuncionario;		
		
		Funcionario[] funcionarios = new Funcionario[10];	
		
		 qtdFuncionario = carregarFuncionario(funcionarios);		
		
		 exibirFuncionario(funcionarios,  qtdFuncionario);
		
	}
	
	public static int carregarFuncionario(Funcionario [] funcionarios) {
		int i=0, n=1;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			 Funcionario funcionario = new Funcionario();
			 
			 System.out.println(" Informe o nome do funcionario : ");					 
			 funcionario.setNome(sc.next());
			 
			 System.out.println(" Informe a matricula do funcionario : ");
			 funcionario.setMatricula(sc.nextInt());			 
			 
			 System.out.println(" Informe o salario do funcionario : ");
			 funcionario.setSalario(sc.nextDouble());
			 
			 funcionarios[i] = funcionario;
			 
			 System.out.println(" Deseja cadastrar outro funcionario ? se sim (1) não (0) ");			
			  n = sc.nextInt();
			i++;
		}while((i< funcionarios.length) && (n !=0));
		
		return i;
		
	}
	
	
	public static void exibirFuncionario(Funcionario[] funcionarios, int qtdFuncionario) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Exibir dados dos Funcionarios");
		
		for(int i=0; i<qtdFuncionario; i++) {
			
			System.out.println("Nome : "+ funcionarios[i].getNome());
			System.out.println("Matricula : "+ funcionarios[i].getMatricula());
			System.out.println("Salario : "+ funcionarios[i].getSalario());
			System.out.println("INSS : "+ df.format(funcionarios[i].calcularInss()));
			
			System.out.println("--------------------------------------");
			System.out.println("--------------------------------------");
		}
		
		
	}
	
	
	
	
	
	

}


