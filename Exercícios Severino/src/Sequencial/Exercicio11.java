import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        System.out.printf("O antecessor do número %1$d é %2$d.\nO sucessor do número %1$d é %3$d.\nO dobro do número %1$d é %4$d.\nA metade do número %1$d é de %5$d.",num,(num-1),(num+1),(num*2),(num/2));
        sc.close();
    }
}
