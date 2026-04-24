import java.util.Scanner;
import java.util.Arrays;

public class FrequenciaNumero {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 4, 4, 5 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número a ser verificado:");
        int pesquisa = sc.nextInt();

        int contador = 0;
        for (int n : array) {
            if (n == pesquisa) {
                contador++;
            }
        }
        System.out.println("O número " + pesquisa + " aparece " + contador + " vez(es).");
        System.out.println(Arrays.toString(array));
        sc.close();
    }

}
