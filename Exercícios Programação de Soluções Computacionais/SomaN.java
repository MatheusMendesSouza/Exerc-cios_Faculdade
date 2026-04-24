import java.util.Scanner;
import java.util.ArrayList;

public class SomaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Divisores = new ArrayList<>();
        int num, soma = 0;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Divisores.add(i);
            }
        }
        for (int n : Divisores) {
            soma += n;
        }
        System.out.println("A soma dos números divisíveis por 3 e 5 é de " + soma);
        sc.close();
    }

}
