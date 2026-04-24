import java.util.Scanner;
import java.util.ArrayList;

public class Perfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Divisores = new ArrayList<>();
        int num, soma = 0;

        System.out.println("Verificador de Números Perfeitos!");
        System.out.println("Digite um número:");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                Divisores.add(i);
            }
        }
        System.out.println(Divisores);

        for (int n : Divisores) {
            soma += n;
        }
        System.out.println("A soma dos divisores é de "+ soma +".");

        if (soma == num) {
            System.out.println("O número é perfeito!");
        } else {
            System.out.println("O número não é perfeito!");
        }
        sc.close();
    }
}