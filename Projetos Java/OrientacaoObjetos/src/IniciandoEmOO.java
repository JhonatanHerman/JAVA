
public class IniciandoEmOO {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.nome = "Jhonatan Herman";
		func1.RA = 123456;
		func1.salario = 4500;
		func1.cargo = "Developer";
		
		
		func2.nome = "Hortolandia";
		func2.RA = 138110;
		func2.salario = 6000;
		func2.cargo = "Gerente";
		
		
		//System.out.print(func2.nome + func1.cargo);
		
		
		//func1.calcSalario();
		//func2.calcSalario();
		
		double calculado = func1.calcSalarioAnual();
		System.out.println("Salario anual " + calculado);
		
		
		
		int meses = 5;
		double bonus = 500.00;
		calculado = func1.calcSalario(meses, bonus);
		System.out.println("salario em 5 meses: " + calculado);
		
	}	

}
