import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        String numInv = "",numOriginal = "";

        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        numOriginal = String.valueOf(numero);

        while (numero != 0) {
            digito = numero % 10;
            numInv += String.valueOf(digito);
            numero = numero / 10;
        }
        if (numOriginal.equals(numInv)) {
            System.out.println("O numero é Palíndromo.");
        } else {
            System.out.println("O numero não é um Palíndromo.");
        }
        sc.close();
    }

}
