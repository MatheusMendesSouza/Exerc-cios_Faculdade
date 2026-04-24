import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;

        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();

        if (salario < 1000) {
            salario = salario * 1.3;
            System.out.printf("Você recebeu um aumento de 30%%! Seu novo salário é de %.2f.", salario);
        } else {
            System.out.println("Você não tem direito ao aumento!");
        }
        sc.close();
    }

}
