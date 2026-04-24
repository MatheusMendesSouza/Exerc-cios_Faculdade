import java.util.Scanner;
import java.math.BigInteger;

public class MDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        BigInteger num = sc.nextBigInteger();
        System.out.println("Digite outro número:");
        BigInteger num2 = sc.nextBigInteger();

        BigInteger resultado = num.gcd(num2);

        System.out.printf("O MDC é de "+ resultado);        
        sc.close();
    }
    
}
