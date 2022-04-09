public class Dependente {
    private String Nome;
    private String DataNasc;
    private int TipoDepend;

    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setDataN(String dataN){
        this.DataNasc = dataN;
    }

    public String getDataN(){
        return this.DataNasc;
    }

    public void setTipoDepend(int tipo){
        this.TipoDepend = tipo;
    }

    public int getTipoDepend(){
        return this.TipoDepend;
    }
}
