import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n, soma = 0, npares = 0;
            double media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0;i<n;i++) {
            System.out.print("Digite um numero: ");
                vect[i] = sc.nextInt();
                if (vect[i] % 2 == 0){
                    soma += vect[i];
                    npares++;
            }

        }

        if (npares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double)soma/npares;
            System.out.println("MEDIA DOS PARES = " + media);
        }

        sc.close();


    }
}