import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int num,tabuada;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            tabuada = num*i;
            System.out.printf("%d x %d = %d \n", num,i,tabuada);
        sc.close();    
        }
    }  
}