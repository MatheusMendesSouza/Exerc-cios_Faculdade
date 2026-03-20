import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int num1,num2,num3,media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();

        System.out.print("Digite mais um número: ");
        num3 = sc.nextInt();

        media = (num1+num2+num3)/3;

        System.out.printf("A média dos números digitados é de "+ media + ".");
        sc.close();
    }
}
