public class ContasClientesOn {
    private String Nome;
    private double Saldo;
    

    public ContasClientesOn(String Nome){
        this.Nome = Nome;

    }

    public void Deposito (double saldo){
        this.Saldo += saldo;

    }

    public void getSaldo(){
        System.out.println(this.Saldo);
    }


    public String getNome(){
        return this.Nome;


    }


    public void Comprar(Produtos produto){
        this.Saldo -= produto.getPreco();
    }
}
