import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ladoA, ladoB, ladoC;

        System.out.println("Escreva o valor do 1° lado: ");
        ladoA = sc.nextFloat();
        System.out.println("Escreva o valor do 2° lado: ");
        ladoB = sc.nextFloat();
        System.out.println("Escreva o valor do 3° lado: ");
        ladoC = sc.nextFloat();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
            System.out.println("As medidas formam um triângulo!");
        } else {
            System.out.println("As medidas não formam um triângulo!");
        }
        sc.close();
    }

}
