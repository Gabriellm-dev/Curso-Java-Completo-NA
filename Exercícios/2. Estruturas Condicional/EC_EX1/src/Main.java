import java.util.Locale;
import java.util.Scanner;

/*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >=0){
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}