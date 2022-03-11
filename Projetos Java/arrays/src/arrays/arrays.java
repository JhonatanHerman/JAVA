package arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		int vetor [] = new int[5];
		//System.out.println(vetor.length);
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = i*2;
		}
 			
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Posição: " + i + " - valor: " + vetor[i]);
		}

		
		
		
	
		//ATIVIDADE
		
		Scanner scan = new Scanner(System.in);
		int qtd, j=1;
		float soma=0, media=0;
		
		
	
		
		System.out.println("Informe quantas notas deseja: ");
		qtd = scan.nextInt();
		
		float notas [] = new float[qtd];
		for (j=0; j<qtd; j++) {
			System.out.print("\nDigite a " + (j+1) + "° nota: ");
			notas[j] = scan.nextFloat();
			soma += notas[j];
			
		}
		
		for (j=0; j<qtd; j++) {
			System.out.println("nota " + (j+1) + " nota: " + notas[j]);
			
			
		}
		
		System.out.println("Soma de todas as notas: " + soma);
		
		//Calculo e saida da media: 
		media = soma / qtd;
		System.out.println("Media do aluno: " + media);
		
		
		
		//MATRIZ
		int [][] matriz = new int [3][5];
		int cont = 0;
		
		
		System.out.println("\n\nTAMANHO DIMENSAO 1 DA MATRIZ: " + matriz.length);
		
		System.out.println("TAMANHO DIMENSAO 2 DA MATRIZ: " + matriz[1].length);
		
		for (int k=0; k<matriz.length; k++) {
			
			for (int l=0; l<matriz[k].length; l++) {
				
				matriz[k][l] = cont++;
			}
		}
		
		
		for (int k=0; k<matriz.length; k++) {
			
			for (int l=0; l<matriz[k].length; l++) {
				
				System.out.print(matriz[k][l] + "\t");
			}
			System.out.println();
		}	
		
 	}

}
