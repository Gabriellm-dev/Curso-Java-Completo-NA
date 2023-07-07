import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double div = A/B;
                if (B == 0){
                    System.out.println("Divisão impossivel");
                } else {
                    System.out.println(div);
                }
        }
    }
}