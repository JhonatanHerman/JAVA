
public class Banco {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.depositar(500.00);
		
		System.out.println(conta1.saldo);

		
		conta1.depositar(500.00);
		System.out.println(conta1.saldo);
		
		
	}

}
