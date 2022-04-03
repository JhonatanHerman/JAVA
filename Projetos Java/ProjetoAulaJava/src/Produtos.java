public class Produtos {
    private double Preco;
    private int Prateleira;
    private String Tipo;  //Organico ou Industrializado
    private String Nome;

    public Produtos(String Nome, String Tipo, int Prateleira,  double Preco){
        this.Nome = Nome;
        this.Prateleira = Prateleira;
        this.Tipo = Tipo;
        this.Preco = Preco;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return this.Nome;
    }

    //Preço
    public void setPreco (double Preco){
        this.Preco = Preco;
    }

    public double getPreco(){
        return this.Preco;
    }

    //Prateleira
    public void setPrateleira(int Prateleira){
        this.Prateleira = Prateleira;
    }

    public int getPrateleira(){
        return this.Prateleira;
    }

    //Tipo
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public String getTipo(){
        return this.Tipo;
    }

    public void RelatProduto(){
        String txt = "\nNome do produto: " + this.Nome + ", está na prateleira: " + this.Prateleira + ", ele é: " + this.Tipo + "\nSeu preço: " + this.Preco + "R$";

        System.out.println(txt);
    }




}
