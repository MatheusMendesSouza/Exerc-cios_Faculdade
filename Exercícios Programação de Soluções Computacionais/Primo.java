import java.util.Scanner;
import java.util.ArrayList;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Divisores = new ArrayList<>();

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (Divisores.size() > 2) {
                break;
            }
            if (num % i == 0) {
                Divisores.add(i);
                System.out.println(Divisores);
            }
        }
        if (Divisores.size() > 2) {
            System.out.println("Número não é Primo.");
        } else {
            System.out.println("Número Primo.");
        }
        sc.close();
    }

}