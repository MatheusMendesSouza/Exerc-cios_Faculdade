import java.util.Scanner;

public class Repeticao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperaturas[] = new float[10], total = 0;
        Double media;

        for (int i = 1; i <= temperaturas.length; i++) {
            System.out.println("Digite a temperatura do " + i + "° dia:");
            temperaturas[i - 1] = sc.nextFloat();
        }
        for (float n : temperaturas) {
            total += n;
        }
        media = (double) total / temperaturas.length;

        System.out.println("A média das temperaturas é de " + media + "°.");
        sc.close();
    }

}
