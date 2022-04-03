public class Numeros {

    public void MaiorNumero(int a, int b){
        
        if (a > b){
            System.out.println("O maior número é: " + a);

        }else{
            System.out.println("O maior número é: " + b);
        }
    }

    public void NumeroDecrescente(int c){
    
        for (int i=c; i>=0; i-- ){
            System.out.print(i + " ");
        }

    }

    public void NumerosImpares(int d){
        System.out.println("\n");

        
        for(int i=1; i<=d; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        
    }


}
