import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float cotacao, qtd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da cotação do dolar: ");
        cotacao = sc.nextFloat();
        
        System.out.print("Digite quantos dólares você possui:");
        qtd = sc.nextFloat();

        System.out.printf("Você possui exatamente %.2f reais",(qtd*cotacao));
        sc.close();   
    }
}
