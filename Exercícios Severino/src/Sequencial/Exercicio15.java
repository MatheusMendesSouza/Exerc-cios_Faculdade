import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        String candidato1, candidato2;
        int numEleitores, numVotos1, numVotos2;
        double porcCand1,porcCand2,porcNulo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do 1° candidato a eleição:");
        candidato1 = sc.nextLine();
        System.out.println("Digite o nome do 2° candidato:");
        candidato2 = sc.nextLine();

        System.out.println("Digite o número Total de Eleitores: ");
        numEleitores = sc.nextInt();
        System.out.println("Digite o número Total de votos no candidato(a) " + candidato1 + ".");
        numVotos1 = sc.nextInt();
        System.out.println("Digite o número Total de votos no candidato(a) " + candidato2 + ".");
        numVotos2 = sc.nextInt();

        porcCand1 = (numVotos1/(double)numEleitores) *100;
        porcCand2 = (numVotos2/(double)numEleitores) *100;
        porcNulo = ((numEleitores - (numVotos1+numVotos2))/(double)numEleitores)*100;

        System.out.printf("A porcentagem de votos do candidato %s foi de %.2f %%.\nA porcentagem de votos do candidato %s foi de %.2f %%.\nA porcentagem de votos nulos/brancos foi de %.2f %%.",candidato1,porcCand1,candidato2,porcCand2,porcNulo);
        sc.close();
    }
}
