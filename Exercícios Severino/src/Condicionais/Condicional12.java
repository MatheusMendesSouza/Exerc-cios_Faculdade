import java.util.Scanner;

public class Condicional12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, resultado;
        int operacao = 0;

        while (operacao != 5) {
            System.out.println("Informe a operação:\n1 – Somar\n" +
                    "2 – Subtrair\n" +
                    "3 – Multiplicar\n" +
                    "4 – Dividir\n" +
                    "5 – Sair");
            operacao = sc.nextInt();
            if (operacao >= 1 && operacao <= 4) {
                System.out.println("Informe o 1° número:");
                num1 = sc.nextFloat();
                System.out.println("Informe o 2° número:");
                num2 = sc.nextFloat();

                switch (operacao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("O resultado da operação é: " + resultado + "\n");
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("O resultado da operação é: " + resultado+ "\n");
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("O resultado da operação é: " + resultado+ "\n");
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("O resultado da operação é: " + resultado+ "\n");
                        } else {
                            System.out.println("Divisão inválida, 2° número não pode ser 0.\n");
                        }
                        break;

                    default:
                        if (operacao != 5)
                            System.out.println("Operação inválida!");
                        break;
                }
            }
        }

        sc.close();
    }

}
