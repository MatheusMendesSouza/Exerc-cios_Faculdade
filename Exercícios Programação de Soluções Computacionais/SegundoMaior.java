import java.util.Arrays;

public class SegundoMaior {
    public static void main(String[] args) {
        int[] numeros = {5,6,3,1,2,8,9,7};

        Arrays.sort(numeros);

        System.out.println("O segundo maior é: " + numeros[numeros.length - 2]);
        System.out.println(Arrays.toString(numeros));
    }
    
}