import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double altura,pesoIdeal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua altura (em metros):");
        altura = sc.nextDouble();

        pesoIdeal = (62.1 * altura) - 44.7;

        System.out.printf("Seu peso ideal deve ser de %.2f kg. ", pesoIdeal);
        sc.close();
    }

}