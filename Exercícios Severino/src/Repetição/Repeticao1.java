import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int matricula = 0;

        while (matricula >= 0) {
            System.out.println("Informe a matrícula do aluno(ou negativa para a saída do looping):");
            matricula = sc.nextInt();
            if (matricula >= 0) {
                for (int i = 1; i <=3; i++) {
                    System.out.println("Digite a " + i + "° nota do aluno:");
                    media += sc.nextDouble();
                }
                media = media / 3;

                if (media >= 70) {
                    System.out.printf("A média é de %.2f.\nAprovado\n",media);
                } else if (media >= 60 && media < 70) {
                    System.out.printf("A média é de %.2f.\nExame\n",media);
                } else {
                    System.out.printf("A média é de %.2f.\nReprovado\n",media);
                }
                media = 0;
            }
        }
        sc.close();
    }

}
