import java.util.Scanner;

public class Condicional9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade:");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Não Eleitor!");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor Obrigatório!");
        } else {
            System.out.println("Eleitor Facultativo!");
        }
        sc.close();
    }
}
