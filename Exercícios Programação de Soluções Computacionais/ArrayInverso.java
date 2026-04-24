import java.util.Scanner;
import java.util.Arrays;

public class ArrayInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palavra = new String[10];

        for (int i = 0; i < palavra.length; i++) {
            System.out.println("Digite a palavra da posição [" + i + "]:");
            palavra[i] = sc.nextLine();
        }

        for (int i = 0; i < palavra.length / 2; i++) {
            String temp = palavra[palavra.length - i - 1];
            palavra[palavra.length - 1 - i] = palavra[i];
            palavra[i] = temp;
        }

        System.out.println("A ordem inversa do Array é de " + Arrays.toString(palavra));
        sc.close();
    }

}
