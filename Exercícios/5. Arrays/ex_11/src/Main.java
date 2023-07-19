import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdhomens, qtdmulheres;
        double alturafemMed, alturafemTot;
        System.out.print("Quantas pesssoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Altura da %da pessoa: %n", i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: %n", i+1);
            genero[i] = sc.next().charAt(0);
        }

        double menoraltura = altura[0];
        double maioraltura = altura[0];

        for (int i=0; i<n; i++) {
            if (altura[i] > maioraltura){
                maioraltura = altura[i];
            }
            if (altura[i] < menoraltura){
                menoraltura = altura[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;
        alturafemTot = 0;

        for (int i=0; i<n; i++) {
            if (genero[i] == 'M'){
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemTot += altura[i];
            }
        }

        alturafemMed = alturafemTot / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMed);
        System.out.printf("Numero de homens = %d\n", qtdhomens);


        sc.close();

    }
}