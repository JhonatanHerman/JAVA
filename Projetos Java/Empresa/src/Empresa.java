public class Empresa {
    public static void main(String[] args){
       

        Funcionario Jhonatan = new Funcionario("Programador", "Jhonatan", 2103, 7500.00);


        System.out.println("Antigo cargo: " + Jhonatan.getCargo());

        Jhonatan.setCargo("Gerente");

        System.out.println("Novo cargo: " + Jhonatan.getCargo());

    }
}
