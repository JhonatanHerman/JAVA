
package escola;


public class Professor extends Funcionario {
    private double Adicional;
    private String Titulacao;
    
    public Professor(int matricula, String nome, double Adicional){
        //super é a classse pai
        super(matricula, nome);
        this.Adicional = Adicional;
    }
    
    public double getAdicional() {
        return Adicional;
    }

    
    public void setAdicional(double adicional) {
        this.Adicional = adicional;
    }

    
    public String getTitulacao() {
        return Titulacao;
    }

    
    public void setTitulacao(String titulacao) {
        this.Titulacao = titulacao;
    }
    
    public String toString(){
        return "Professor";
    }
}
