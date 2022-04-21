
package escola;


public class Monitor extends Funcionario{
    private String setor;
    private String turno;
    
    public Monitor(int Matricula, String nome, String setor){
        //super é a classse pai
        super(Matricula, nome);
        this.setor = setor;
        
    }
    
    
    public String getSetor() {
        return setor;
    }

    
    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    public String getTurno() {
        return turno;
    }

    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
