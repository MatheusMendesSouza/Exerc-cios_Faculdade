import java.util.Scanner;
import java.util.Arrays;

public class ArrayPesquisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palavra = new String[10];
        int posicao = -1;

        for (int i = 0; i < palavra.length; i++) {
            System.out.println("Digite a palavra da posição[" + i + "]:");
            palavra[i] = sc.nextLine();
        }

        System.out.println("Digite a palavra a ser verificada:");
        String letra = sc.nextLine();

        for (int j = 0; j < palavra.length; j++) {
            if (palavra[j].equalsIgnoreCase(letra)) {
                posicao = j;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println(
                    "A palavra " + letra + " está no array " + Arrays.toString(palavra) + " na posição " + posicao);
        } else {
            System.out.println("A palavra " + letra + " não está no array.");
        }
        sc.close();

    }

}
