/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

/**
 *
 * @author jhowherman
 */
public class ContaClientesOn {
    private String Nome;
    private double Saldo;
    

    public ContaClientesOn(String Nome){
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
