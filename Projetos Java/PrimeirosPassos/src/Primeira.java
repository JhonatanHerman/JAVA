import java.util.Random;
import java.util.Scanner;


public class Primeira {

	
	public static void main(String[] args) {
		
		/*System.out.println("Meu primeiro programa em Java");
		
		//inteiros
		byte var1 = 127;
		short v2 = 32767;
		int v3 = 1000;
		long v4 = 1000;
		
		//Reais
		float f1 = 50.0f;
		double f2 = 50.5;
		
		//Caractere
		char c1 = 'c';
		
		//Lógico
		boolean b1 = true;
		
		//String
		String str = "Java";
		
		System.out.println("V3 É MAIOR QUE V4??");
		if (v3 > v4)
		{
			System.out.println("MAIOR");
		}
		else {
			System.out.println("NÃO É MAIOR");
		}*/
		
		
		Random rand = new Random();

		
		int a=4, b=5;
		
		if (a>b) {
			System.out.println("a>b");
		}else {
			System.out.println("b>a");
		}
		
		int i=0;
		while (i<10) {
			System.out.println("etapa " + (i+1)+ " - Numero sorteado: " + (rand.nextInt(10)+20));
			i++;
		}
		
		
		
		System.out.println("\n");
		System.out.println(rand.nextInt(20)+10);
		
		
		
		System.out.println("\n");
		
		Scanner scan = new Scanner(System.in);
		
		int soma=0, cont=0;
		
		float media=0, nota=-1, notamaior = 0;
		do{
			System.out.println("Digite uma nota 0-10: ");
			nota = scan.nextFloat();
			soma += nota;
			
			if (nota > notamaior) {
				notamaior = nota;
			}
			cont++;
			
		}while(nota != 0);
		
		System.out.println("O valor somado é " + soma);
		media = soma / cont;
		System.out.println("A média é " + media);
		System.out.println("A maior nota é " + notamaior);
		
		
		
		
		
		for (int j=0; j<10; j++) {
			System.out.println("Mensagem " + j);
			
		
		}
		
		
	}

}
