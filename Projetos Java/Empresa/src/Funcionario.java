public class Funcionario {
    private String Cargo;
    private String Nome;
    private int RA;
    private double Salario;
    
    //É
    private Endereco endereco;
    private Dependente dependente;


    //Construtores, getters e setters

    public Funcionario(String cargo, String nome, int ra, double salario){
        this.Cargo = cargo;
        this.Nome = nome;
        this.RA = ra;
        this.Salario = salario;
    }



    public void setCargo(String cargo){
        this.Cargo = cargo;
    }

    public String getCargo(){
        return this.Cargo;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setRA(int ra){
        this.RA = ra;
    }

    public int getRA(){
        return this.RA;
    }

    public void setSalario(double salario){
        this.Salario = salario;
    }

    public double getSalario(){
        return this.Salario;
    }


}
