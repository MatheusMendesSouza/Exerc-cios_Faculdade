import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double temp, tempF;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a temperatura em Celsios: ");
        temp = sc.nextDouble();

        tempF = (temp * 1.8) + 32;
        System.out.printf("A temperatura %.2f° convertida em Fahrenheit é de %.2f°.", temp, tempF);
        sc.close();
    }
}
