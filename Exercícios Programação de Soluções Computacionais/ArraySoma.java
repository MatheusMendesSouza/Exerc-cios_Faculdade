import java.util.Scanner;
import java.util.Arrays;

public class ArraySoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o valor da posição [" + i + "]:");
            numeros[i] = sc.nextInt();
        }

        for (int n : numeros) {
            soma += n;
        }

        System.out.println("A soma dos números " + Arrays.toString(numeros) + " é de " + soma);
        sc.close();
    }

}
