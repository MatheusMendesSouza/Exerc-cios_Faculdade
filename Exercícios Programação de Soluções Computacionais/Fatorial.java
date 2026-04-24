import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um número para o cálculo do fatorial:");
        int num = sc.nextInt();

        while (num >= 1) {
            fatorial *= num;
            num--;
        }

        System.out.println("O fatorial do número é de " + fatorial);
        sc.close();
    }
}