import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        num1 = sc.nextInt();

        System.out.println("Informe mais um número:");
        num2 = sc.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 - num2;

        System.out.printf("Com os valores trocados, o 1° número recebe %d e o 2° recebe %d. \n", num1, num2);

        sc.close();
    }
}
