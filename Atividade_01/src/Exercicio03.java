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
        
        reorganizar(array, k);
        System.out.println("Array reorganizado: " + array);
        
        scanner.close();
    }
    
    public static void reorganizar(ArrayList<Integer> array, int k) {
        int Insercao = 0;

        // Percorre o array movendo elementos menores ou iguais a k para a frente
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) <= k) {
                // Troca apenas quando necessário
                if (i != Insercao) {
                    int t = array.get(i);
                    array.set(i, array.get(Insercao));
                    array.set(Insercao, t);
                }
                Insercao++;
            }
        }
    }
}