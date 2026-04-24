import java.util.Scanner;
import java.math.BigInteger;

public class MMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        BigInteger num = sc.nextBigInteger();
        System.out.println("Digite outro numero:");
        BigInteger num2 = sc.nextBigInteger();

        BigInteger MDC = num.gcd(num2);

        BigInteger resultado = (num.multiply(num2)).divide(MDC);
        System.out.println("O MMC entre os números é de "+ resultado);

        sc.close();
    }

}
