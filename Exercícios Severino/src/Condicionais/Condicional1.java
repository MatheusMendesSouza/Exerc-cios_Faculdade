import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA,numB;
        
        System.out.println("Digite um número: ");
        numA = sc.nextInt();
        System.out.println("Digite outro número: ");
        numB = sc.nextInt();

        if(numA > numB){
            System.out.printf("O número %d é maior que %d!", numA,numB);
        }else if(numA < numB){
            System.out.printf("O número %d é menor que %d!",numA,numB);
        }else{
            System.out.printf("Os números %d e %d são iguais!",numA,numB);
        }
        sc.close();
    }
}