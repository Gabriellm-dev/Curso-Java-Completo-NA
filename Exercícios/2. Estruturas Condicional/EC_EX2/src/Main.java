import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}