import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double num,numQuad,numCub,raiz,raizCub;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número positivo: ");
        num = sc.nextInt();

        numQuad = Math.pow(num,2);
        numCub = Math.pow(num,3);
        raiz = Math.sqrt(num);
        raizCub = Math.cbrt(num);

        System.out.printf("O quadrado do número %1$.0f é %2$.2f.\nO número %1$.0f ao cubo é %3$.2f.\nA raiz quadrada do número %1$.0f é %4$.2f.\nE a raiz cubica do número %1$.0f é %5$.2f.\n",num,numQuad,numCub,raiz,raizCub);
        sc.close();
    }
    
}
