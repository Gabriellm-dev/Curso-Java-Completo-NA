import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double vlrUniPeca1 = sc.nextDouble();
        int codPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double vlrUniPeca2 = sc.nextDouble();

        double valorAPagar = (numPeca1 * vlrUniPeca1) + (numPeca2 * vlrUniPeca2);
        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorAPagar);
    }
}