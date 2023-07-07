import java.util.Scanner;

/*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hInicial = sc.nextInt();
        int hFinal = sc.nextInt();
        int duracao = 0;
        if (hInicial > hFinal) {
            duracao = 24 - (hInicial - hFinal);
            System.out.println(duracao);
        } else if (hFinal > hInicial) {
            duracao = hFinal - hInicial;
            System.out.println(duracao);

        } else {
            duracao = 24;
            System.out.println(duracao);
        }
    }
}
