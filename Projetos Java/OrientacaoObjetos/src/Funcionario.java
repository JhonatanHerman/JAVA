
public class Funcionario {
	
	String nome;
	int RA;
	double salario;
	String cargo;
	
	
	double calcSalarioAnual() {
		
		//System.out.println(salario*12);
		return salario*12;
		
	}
	
	double calcSalario(int meses, double bonus) {
		
		return salario * meses + bonus;
		
	}
	
	
}
