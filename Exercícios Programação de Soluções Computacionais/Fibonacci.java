import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Fibonacci = new ArrayList<>();
        Fibonacci.add(0);
        Fibonacci.add(1);

        System.out.println("Digite um valor limite de quantidades do Fibonacci:");
        int limite = sc.nextInt();

        while (limite > 2) {
            int tamanho = Fibonacci.size();
            int soma = Fibonacci.get(tamanho - 1) + Fibonacci.get(tamanho - 2);
            Fibonacci.add(soma);

            limite--;
        }
        System.out.println(Fibonacci);
        sc.close();
    }

}
