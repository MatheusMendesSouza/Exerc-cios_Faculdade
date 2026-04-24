import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc, altura, peso;

        System.out.println("Informe a altura em metros:");
        altura = sc.nextDouble();
        System.out.println("Informe o peso em kg:");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f.\n",imc);
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (20 <= imc && imc < 25) {
            System.out.println("Peso normal");
        } else if (25 <= imc && imc < 30) {
            System.out.println("Sobre Peso");
        } else if (30 <= imc && imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }
        sc.close();
    }
}
