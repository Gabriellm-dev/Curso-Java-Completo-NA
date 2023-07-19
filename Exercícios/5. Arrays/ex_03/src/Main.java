import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas ? ");
            int n = sc.nextInt();

            String[] name = new String[n];
            int[] age = new int[n];
            double[] alt = new double[n];

            double soma = 0;
            int menorde = 0;

            for (int i=0; i < n; i++){

                System.out.println("Dados da "+ (i+1) + " pessoa: ");
                System.out.print("Nome: ");
                name[i] = sc.next();
                System.out.print("Idade: ");
                age[i] = sc.nextInt();
                System.out.print("Altura: ");
                alt[i] = sc.nextDouble();
                soma += alt[i];

                if (age[i] < 16){
                    menorde ++;
                }
            }

        double media = soma/n;
        System.out.printf("Altura média: %.2f%n",media);

        double porc = (double)menorde/n *100.0;
        System.out.println("Pessoas com menos de 16 anos: "+ porc + " %");

        for (int i=0; i < n; i++){
            if (age[i] < 16){
                System.out.println(name[i]);
            }
        }

        sc.close();

    }
}