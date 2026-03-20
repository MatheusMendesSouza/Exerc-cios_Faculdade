import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int a, b, c;
        double delta, raiz1, raiz2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente a da equação: ");
        a = sc.nextInt();
        System.out.print("Digite o coeficiente b da equação: ");
        b = sc.nextInt();
        System.out.print("Digite o coeficiente c da equação: ");
        c = sc.nextInt();

        delta = Math.pow(b, 2) - (4 * a * c);
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (delta < 0) {
            System.out.println("Não existe raiz para a equação.");
        } else {
            System.out.println("As raízes são " + raiz1 + " e " + raiz2);
            sc.close();
        }
    }

}
