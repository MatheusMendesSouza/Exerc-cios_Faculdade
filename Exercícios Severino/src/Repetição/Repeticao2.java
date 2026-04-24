import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        double salario = 0, totalSalario = 0, mediaFilho, mediaSalario;
        int totalFilho = 0,numeroEntrevistados = 0;
        Scanner sc = new Scanner(System.in);

        while (salario >= 0) {
            System.out.println("Digite o seu salário (ou um valor negativo para sair do looping):");
            salario = sc.nextDouble();
            if (salario >= 0) {
                numeroEntrevistados++;
                totalSalario += salario;
                System.out.println("Digite quantos filhos você tem:");
                totalFilho += sc.nextInt();
            }
        }
        if (numeroEntrevistados > 0) {
            mediaSalario = totalSalario / numeroEntrevistados;
            mediaFilho = (double)totalFilho / numeroEntrevistados;

            System.out.println("A media salarial da população é " + mediaSalario);
            System.out.println("A média de filhos da população é " + mediaFilho);
        } else {
            System.out.println("Ninguém foi entrevistado!");
        }
        sc.close();
    }

}
