public class Funcionarios {
    private String Nome;
    private double Salario;
    private String Cargo;
    private int RA;

    public Funcionarios(String Nome, double Salario, String Cargo, int RA){
        this.Nome = Nome;
        this.Salario = Salario;
        this.Cargo = Cargo;
        this.RA = RA;

    }

    public void setNome(String Nome){
        this.Nome = Nome;

    }

    public String getNome(){
        return this.Nome;

    }

    public void setSalario(double Salario){
        this.Salario = Salario;

    }

    public double getSalario(){
        return this.Salario;

    }

    public void setCargo(String Cargo){
        this.Cargo = Cargo;

    }

    public String getCargo(){
        return this.Cargo;

    }

    public void setRA(int RA){
        this.RA = RA;

    }
    
    public int getRA(){
        return this.RA;
        
    }

    public void RelatorioF(){

        System.out.println(this.Nome + " " + this.Cargo + " " + this.RA + " " + this.Salario);
        
    }


}

