import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float salarioM,salarioFunc,qtdSalarioM;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor atual do salário mínimo: ");
        salarioM = sc.nextFloat();

        System.out.print("Digite o seu salário: ");
        salarioFunc = sc.nextFloat();

        qtdSalarioM = salarioFunc/salarioM;

        System.out.printf("Você recebe aproximadamente %.2f salários.", qtdSalarioM);
        sc.close();
    }    
}
