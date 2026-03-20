import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorCliente,gorjeta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor gasto pelo cliente: ");
        valorCliente = sc.nextFloat();

        gorjeta = valorCliente * 0.1;

        System.out.println("O valor dos 10% do cliente são de R$"+gorjeta);
        sc.close();
    }
    
}
