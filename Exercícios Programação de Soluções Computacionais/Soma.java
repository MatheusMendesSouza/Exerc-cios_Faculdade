import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroOriginal, numero, digito, soma = 0;

        System.out.println("Bem vindo ao somador de digitos!");
        System.out.println("Digite um numero Inteiro:");
        numeroOriginal = scanner.nextInt();
        numero = numeroOriginal;

        while (numero != 0) {
            digito = numero % 10;
            soma += digito;
            numero = numero / 10;
        }

        System.out.printf("A soma do numero %d é de %d.", numeroOriginal, soma);
        scanner.close();
    }
}
