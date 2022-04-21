
package escola;


public abstract class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int Matricula, String nome){
        this.matricula = Matricula;
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }

    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override //
    public String toString(){
        return "Funcionario{" + "Matricula: " + matricula + ", nome: " + nome + "}";
    }
    
}
