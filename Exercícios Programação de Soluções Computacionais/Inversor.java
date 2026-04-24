import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        String numInv="";

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        while (numero != 0) {
            digito = numero % 10;
            numInv += String.valueOf(digito);
            numero = numero / 10;
        }
        System.out.println("O numero inertido é: " + numInv);
        sc.close();
    }
}
