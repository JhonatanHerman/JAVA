/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

/**
 *
 * @author jhowherman
 */
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //####################################################
        Produtos Arroz = new Produtos("Arroz", "Organico", 1, 19.99);
        Produtos Feijao = new Produtos("Feijão", "Organico", 1, 9.49);

        Produtos Agua = new Produtos("Água", "Organico", 2, 1.50);
        Produtos Vinho = new Produtos("Vinho", "Organico", 2, 30.00);
        
        Produtos Trakinas = new Produtos("Trakinas", "Industrial", 3, 2.75);
        Produtos Doritos = new Produtos("Doritos", "Industrial", 3, 8.00);

        Produtos Pao = new Produtos("Pao de forma", "Integral", 4, 6.50);
        Produtos Bolo = new Produtos("Bolo", "Integral", 4, 8.00);


        //Cadastrar produtos em forma de arquivo txt

        Funcionarios Jose = new Funcionarios("Jose", 1500.00, "Estoquista", 12345);

        Jose.RelatorioF();




        //#####################################################

        //Cadastro clientes
        ContaClientesOn Joao = new ContaClientesOn("Joao");
        ContaClientesOn Maria = new ContaClientesOn("Maria");


        Maria.Deposito(500.00);
        Joao.Deposito(1000.00);

        Joao.Comprar(Agua);

        Joao.getSaldo();






        //#####################################################
        Arroz.RelatProduto();
        Feijao.RelatProduto();
        Agua.RelatProduto();
        Vinho.RelatProduto();
        Trakinas.RelatProduto();
        Doritos.RelatProduto();
        Pao.RelatProduto();
        Bolo.RelatProduto();
    }
    
}
