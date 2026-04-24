import java.util.Arrays;

public class UniaoVetor {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 3, 4, 4 };
        int[] array2 = { 5, 5, 5, 6, 7, 7 };
        int[] temp = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, temp, 0, array1.length);
        System.arraycopy(array2, 0, temp, array1.length, array2.length);
        Arrays.sort(temp);

        int j = 1; //posição de inicio para salvar os dados do array, removendo os duplicados

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                temp[j] = temp[i];
                j++;
            }
        }

        temp = Arrays.copyOf(temp, j);

        System.out.println(Arrays.toString(temp));
    }

}
