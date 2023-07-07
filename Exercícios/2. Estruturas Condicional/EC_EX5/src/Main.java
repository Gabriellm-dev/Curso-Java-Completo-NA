import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quant = sc.nextInt();
        double preco = 0;
        switch (n) {
            case 1:
                preco = 4.00 * quant;
                System.out.printf("Total: R$ %.2f",preco);
            break;
            case 2:
                preco = 4.50 * quant;
                System.out.printf("Total: R$ %.2f",preco);
                break;
            case 3:
                preco = 5.00 * quant;
                System.out.printf("Total: R$ %.2f",preco);
                break;
            case 4:
                preco = 2.00 * quant;
                System.out.printf("Total: R$ %.2f",preco);
                break;
            case 5:
                preco = 1.50 * quant;
                System.out.printf("Total: R$ %.2f",preco);
                break;
        }
    }
}