import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro:");
        num = sc.nextInt();

        System.out.println("Os números ímpares até o " + num + " são:");

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
