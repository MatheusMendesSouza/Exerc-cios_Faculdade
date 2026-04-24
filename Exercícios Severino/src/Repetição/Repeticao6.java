import java.util.Scanner;

public class Repeticao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sexo = new String[10];
        float peso[] = new float[10];
        int totalHomens = 0, totalMulheres = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o sexo da pessoa:(masculino,feminino)");
            sexo[i] = sc.nextLine();
            System.out.println("Digite o peso em kg:");
            peso[i] = sc.nextFloat();
            sc.nextLine();
        }

        for (int i = 0; i < peso.length; i++) {
            if (peso[i] >= 60 && peso[i] <= 80) {
                if (sexo[i].equals("masculino")) {
                    totalHomens++;
                }
            } 
            if (peso[i] >= 50 && peso[i] <= 70) {
                if (sexo[i].equals("feminino")) {
                    totalMulheres++;
                }
            }
        }

        System.out.printf("O total de Homens entre 60 e 80 kg é de %d e o total de mulheres entre 50 e 70 kg é de %d",totalHomens, totalMulheres);
        sc.close();
    }
}
