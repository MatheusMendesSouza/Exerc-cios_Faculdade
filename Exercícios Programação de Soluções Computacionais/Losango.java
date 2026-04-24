import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do losango(Ímpar):");
        int tamanho = sc.nextInt();
        int qtd = 1,espaco = tamanho/2;

        for (int i = 1; i <= (tamanho/2+1); i++) {
            for (int j = 1; j <= espaco; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= qtd; k++) {
                System.out.print("*");
            }
            System.out.println("");
            qtd+=2;
            espaco--;
        }
        espaco = 1;
        qtd = tamanho - 2;
        for (int i = 1; i <= (tamanho/2); i++) {
            for (int j = 1; j <= espaco; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= qtd; k++) {
                System.out.print("*");
            }
            System.out.println("");
            qtd-=2;
            espaco++;
        }
        sc.close();
    }

}

