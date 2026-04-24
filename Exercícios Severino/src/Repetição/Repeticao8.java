import java.util.Scanner;

public class Repeticao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso[] = new float[7], media = 0;
        int idade[] = new int[peso.length], qtd = 0;
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o seu peso:");
            peso[i] = sc.nextFloat();

            if(peso[i]>90){
                qtd++;
            }
            
            System.out.println("Digite a sua idade:");
            idade[i] = sc.nextInt();
            media+= idade[i];
        }

        media = media / idade.length;
        System.out.printf("A quantidade de pessoas com peso maior q 90 é %d e a media de idades é %.2f .", qtd, media);

        sc.close();
    }

}
