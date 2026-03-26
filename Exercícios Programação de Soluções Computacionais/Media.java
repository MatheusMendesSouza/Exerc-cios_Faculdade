
//Da pra fazer por ArrayList também!
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parar;
        float soma = 0, media;
        int contador = 0;

        System.out.println("Bem vindo a Calculadora de Média!");

        do {
            contador++;
            System.out.println("Digite o valor da nota a ser somada:");
            soma += scanner.nextFloat();
            parar = scanner.nextLine();
            System.out.println("Parar? Y/N");
            parar = scanner.nextLine();
        } while (!parar.equalsIgnoreCase("Y") && !parar.equalsIgnoreCase("Yes"));

        media = soma / contador;
        System.out.printf("A média das %d notas é: %.2f%n", contador, media);
        scanner.close();
    }
}