import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do aluno: ");
            media += sc.nextFloat();
        }

        media = media / 3;

        if (media < 3) {
            System.out.println("A média do aluno é " + media + "\nReprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("A média do aluno é " + media + "\nExame");
        } else {
            System.out.println("A média do aluno é " + media + "\nAprovado");
        }

        sc.close();
    }

}
