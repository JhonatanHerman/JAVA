import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        int n1, n2, n3, n4;

        Scanner scan = new Scanner(System.in);
        Numeros numeros = new Numeros();



        System.out.print("Digite um numero inteiro: ");
        n1 = scan.nextInt();

        System.out.print("\nDigite outro numero inteiro: ");
        n2 = scan.nextInt();

        numeros.MaiorNumero(n1, n2);
        
        //numeros.MaiorNumero(5, 8);


        System.out.print("\nDigite um numero inteiro para ver os numeros abaixo dele: ");
        n3 = scan.nextInt();

        numeros.NumeroDecrescente(n3);



        System.out.print("\nDigite um numero para ver os numeros impares de 1 até ele : ");
        n4 = scan.nextInt();

        numeros.NumerosImpares(n4);

    }
}
