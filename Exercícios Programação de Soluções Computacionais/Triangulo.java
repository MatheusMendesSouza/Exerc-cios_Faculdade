import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do triangulo:");
        int tamanho = sc.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");;
            }
            System.out.println("");
        }
        sc.close();
    }

}
