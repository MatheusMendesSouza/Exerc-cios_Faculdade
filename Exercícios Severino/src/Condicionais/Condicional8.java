import java.util.Scanner;

public class Condicional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Informe a idade do nadador: ");
        idade = sc.nextInt();

        if (idade <= 7) {
            System.out.println("Infantil");
        } else if (idade > 7 && idade <= 10) {
            System.out.println("Juvenil");
        } else if (idade > 10 && idade <= 15) {
            System.out.println("Adolescente");
        } else if (idade > 15 && idade <= 30) {
            System.out.println("Adulto");
        } else {
            System.out.println("Senior");
        }
        sc.close();
    }

}
