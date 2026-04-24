import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor = 1000;

        do {
            System.out.println("Valor restante no caixa " + valor);
            System.out.println("Digite qual a quantia você vai sacar:");
            float saque = sc.nextFloat();

            if (saque > valor) {
                System.out.println("O maior valor de saque deve ser de " + valor);
            } else {
                valor -= saque;
            }
        } while (valor > 0);
        System.out.println("Caixa sem dinheiro, volte depois!");
        sc.close();
    }

}
