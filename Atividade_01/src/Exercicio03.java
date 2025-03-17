import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array para reorganizar:");
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        
        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        
        System.out.println("Digite o valor de k:");
        int k = scanner.nextInt();
        
        Reorganizar(array, k);
        System.out.println("Array reorganizado: " + array);
        
        scanner.close();
    }
    
    public static void Reorganizar(ArrayList<Integer> array, int k) {
        int esquerda = 0, direita = array.size() - 1;
        while (esquerda <= direita) {
            if (array.get(esquerda) <= k) {
                esquerda++;
            } else if (array.get(direita) > k) {
                direita--;
            } else {
                int temp = array.get(esquerda);
                array.set(esquerda, array.get(direita));
                array.set(direita, temp);
                esquerda++;
                direita--;
            }
        }
    }
}
