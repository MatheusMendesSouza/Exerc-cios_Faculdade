import java.util.Scanner;
import java.util.Arrays;

public class ArrayMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escreva o número da posição [" + i + "]:");
            numeros[i] = sc.nextInt();
        }

        for (int n : numeros) {
            total += n;
        }

        int media = total / numeros.length;

        System.out.println("A média dos valores do Array " + Arrays.toString(numeros) + " é de " + media);
        sc.close();
    }

}
