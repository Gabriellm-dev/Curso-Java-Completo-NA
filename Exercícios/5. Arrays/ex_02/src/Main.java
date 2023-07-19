import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}