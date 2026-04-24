import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1,nota2,media;

        System.out.println("Digite a 1° nota do aluno: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a 2° nota do aluno: ");
        nota2 = sc.nextFloat();
        media = (nota1+nota2)/2;

        if(media>=7){
            System.out.printf("A média do aluno é %s.\nAprovado!",media);
        }else{
            System.out.printf("A média do aluno é %s.\nReprovado!",media);
        }
        sc.close();
    }
    
}
