import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o valor da posição [" + i + "]:");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = maior;

        for (int n : numeros) {
            if (maior < n) {
                maior = n;
            } else if (menor > n) {
                menor = n;
            }
        }
        System.out.println("O maior número do Array " + Arrays.toString(numeros) + " é " + maior);
        System.out.println("O menor número do Array " + Arrays.toString(numeros) + " é " + menor);
        sc.close();
    }
}
