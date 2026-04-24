import java.util.Scanner;
import java.util.Arrays;

public class Repeticao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] nota = new float[5];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota do aluno:");
            nota[i] = sc.nextFloat();
        }
        Arrays.sort(nota);
        System.out.printf("A maior nota é %.2f e a menor é %.2f .", nota[nota.length - 1], nota[0]);
        sc.close();
    }

}
