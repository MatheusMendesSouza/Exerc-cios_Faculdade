import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        float diagMaior, diagMenor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a maior diagonal do losango: ");
        diagMaior = sc.nextFloat();

        System.out.print("Digite a menor diagonal do losango: ");
        diagMenor = sc.nextFloat();

        System.out.printf("A área do Losango é de %.2f.", (diagMaior * diagMenor / 2));
        sc.close();
    }
}
