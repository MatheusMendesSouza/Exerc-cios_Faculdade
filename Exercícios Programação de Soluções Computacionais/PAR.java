import java.util.Scanner;

public class PAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0, impar = 0;
        System.out.println("Digite o número inicial do intervalo:");
        int inicio = sc.nextInt();
        System.out.println("Digite o numero limite do intervalo:");
        int limite = sc.nextInt();

        for (int i = inicio + 1; i < limite; i++) {
            if (i % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }
        }
        System.out.printf("A quantidade de numeros pares no intervalo de %d e %d é de %d.\n", inicio, limite, par);
        System.out.printf("A quantidade de numeros impares no intervalo de %d e %d é de %d.\n", inicio, limite, impar);

        sc.close();
    }
}
