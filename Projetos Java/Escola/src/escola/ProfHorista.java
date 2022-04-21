/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;


public class ProfHorista extends Professor {
    private int Qtdaulas;
    private double ValorHora;
    
    public ProfHorista(int matricula, String nome, double adicional, int Qtdaulas, double ValorHora){
        super(matricula, nome, adicional);
        this.Qtdaulas = Qtdaulas;
        this.ValorHora = ValorHora;
    }
    
    
    
    
    public int getQtdaulas() {
        return Qtdaulas;
    }

    
    public void setQtdaulas(int Qtdaulas) {
        this.Qtdaulas = Qtdaulas;
    }

    
    public double getValorHora() {
        return ValorHora;
    }

    
    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
}
