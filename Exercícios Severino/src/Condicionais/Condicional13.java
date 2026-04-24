import java.util.Scanner;

public class Condicional13 {
    public static void main(String[] argas) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Calculadora de equação de 2° grau!\nAx² + Bx + C = 0");
        System.out.println("Informe o valor de A:");
        a = sc.nextFloat();
        System.out.println("Informe o valor de B:");
        b = sc.nextFloat();
        System.out.println("Informe o valor de C:");
        c = sc.nextFloat();

        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Não existe raiz real para a equação!");
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Exite somente uma raiz real!\nA raíz é " + x1);
        } else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Existem 2 raízes!\nAs raízes são " + x1 + " e " + x2);
        }
        sc.close();
    }

}
