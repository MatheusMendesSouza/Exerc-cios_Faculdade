import java.util.Scanner;
import java.util.Arrays;

public class ArrayPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int qtdPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o valor da posição [" + i + "]:");
            numeros[i] = sc.nextInt();
        }

        for (int n : numeros) {
            if (n % 2 == 0) {
                qtdPares += 1;
            }
        }
        System.out.println("A quantidade de números pares no Array " + Arrays.toString(numeros) + " é de " + qtdPares);
        sc.close();
    }
}
