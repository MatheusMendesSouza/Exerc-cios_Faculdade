import java.util.Arrays;

public class ArraysPareseImpares {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];

        int j = 0, k = 0;
        for (int i = 0; i < pares.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[j] = numeros[i];
                j++;
            } else {
                impares[k] = numeros[i];
                k++;
            }
        }

        pares = Arrays.copyOf(pares, j);
        impares = Arrays.copyOf(impares, k);

        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
