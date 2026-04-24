import java.util.Scanner;

public class Condicional5 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sexo;
        double altura, pesoIdeal;

        System.out.println("Informe o gênero: (1-Masculino, 2-Feminino)");
        sexo = sc.nextInt();
        System.out.println("Informe a altura em metros:");
        altura = sc.nextDouble();

        switch (sexo) {
            case 1:
                pesoIdeal = (72.7 * altura) - 58;
                break;
        
            default:
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
        }
        System.out.printf("O peso ideal é %.2f kg.", pesoIdeal);
        sc.close();
    }
}
