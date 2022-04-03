import java.util.Scanner;

public class MediaAluno {
    Scanner scan = new Scanner(System.in);
    
    //Atributos
    private int notas[] = new int[4];
    private int somanotas;

    //Metodos
    public void AdicionarN(){
        
       /* System.out.println("Quantas notas deseja digitar: ");
        int tam = scan.nextInt();*/
        int soma=0;

        for(int i=0; i<4; i++){
            System.out.print("Digite a " + (i+1) + "° nota: ");
            int nota = scan.nextInt();

            if(nota >=0 && nota <= 100){
                notas[i] = nota;
        
            }else{
                
                System.out.println("ERRO! NOTA DEVE SER ENTRE 0 E 100");
                do{
                    System.out.println("Digite a " + (i+1) + "° nota novamente: ");
                    nota = scan.nextInt();
                    notas[i] = nota;

                }while(nota > 100 || nota < 0);
               
            }
            
            soma += notas[i];
            this.somanotas = soma;
        } 
    }

    public float getMedia(){
        float soma = this.somanotas;
        float media;

        media = soma / 4;

        return media;

    }
            
        
}
