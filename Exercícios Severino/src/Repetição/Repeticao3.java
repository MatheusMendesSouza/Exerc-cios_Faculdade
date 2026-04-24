import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número:");
            num = sc.nextFloat();
            System.out.println("O dobro do número é " + num * 2);
        }
        sc.close();
    }

}
