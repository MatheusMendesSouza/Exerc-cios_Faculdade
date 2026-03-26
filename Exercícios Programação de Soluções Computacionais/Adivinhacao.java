import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int NUMEROALEATORIO = random.nextInt(100) + 1;
        int contador = 0, chute;

        System.out.println("Jogo da Adivinhação!");

        do {
            System.out.println("Tente adivinhar o número. Digite um número entre 1 e 100:");
            chute = scanner.nextInt();

            if (chute < NUMEROALEATORIO) {
                System.out.println("Você errou!\nDica: O número é maior que " + chute);
            } else {
                System.out.println("Você errou!\nDica: O número é menor que " + chute);
            }
            contador++;
        } while (chute != NUMEROALEATORIO);

        System.out.printf("Parabéns, você acertou! O numero era %d.\nVocê adivinhou em %d tentativas.", NUMEROALEATORIO, contador);
        scanner.close();
    }
}