/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;


public class ProfIntegral extends Professor{
    private double Horas;
    private String Atividade;
    
    public ProfIntegral(int matricula, String nome, double adicional, double horas){
        super(matricula, nome, adicional);
        this.Horas = horas;
    }
    
    
    public double getHoras() {
        return this.Horas;
    }

    
    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    
    public String getAtividade() {
        return Atividade;
    }

    
    public void setAtividade(String Atividade) {
        this.Atividade = Atividade;
    }
    
}
