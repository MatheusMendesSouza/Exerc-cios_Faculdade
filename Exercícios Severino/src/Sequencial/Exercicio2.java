import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int anoAtual,anoNasc,idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        anoNasc = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        idade = anoAtual-anoNasc;

        System.out.printf("Você tem %d anos.\nEm 2050 você terá %d anos.",idade,(2050-anoNasc) );
        sc.close();
    }
}
