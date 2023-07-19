import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int n, maior, maisvelho;

        System.out.print("Quantas pessoas voce vai digitar ? ");
             n = sc.nextInt();

        int[] age = new int[n];
        String[] name = new String[n];

        for (int i = 0; i<n;i++){
            System.out.println("Dados da " + (i+1) + "a pessoa");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();

        }

        maior = age[0];
        maisvelho = 0;

        for (int i=1; i <n; i++){
            if (age[i] > maior){
                maior = age[i];
                maisvelho = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + name[maisvelho]);

        sc.close();
    }
}