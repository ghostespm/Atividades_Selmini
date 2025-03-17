import java.util.ArrayList;
import java.util.Scanner;

/*
 * Verifica se existe pelo menos um elemento A[i] no vetor que seja a soma de dois elementos anteriores 
 * A[j] e A[k], com j < i e k < i.
 * O algoritmo percorre todos os pares possíveis de elementos anteriores para verificar a condição.
 * Complexidade: O(n³) devido ao uso de três laços aninhados.
 */

public class Exercicio02 {
    public static boolean somaAnterior(ArrayList<Integer> vetor) {
        for (int i = 2; i < vetor.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (vetor.get(i) == vetor.get(j) + vetor.get(k)) {
                        System.out.println(vetor.get(i) + " = " + vetor.get(j) + " + " + vetor.get(k));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();
        
        System.out.println("Insira o tamanho do vetor para verificação (n >= 3):");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("O tamanho do vetor deve ser no mínimo 3.");
            return;
        }
        
        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            vetor.add(scanner.nextInt());
        }
        
        if (somaAnterior(vetor)) {
            System.out.println("Existe um elemento que é a soma de dois anteriores.");
        } else {
            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }
        
        scanner.close();
    }
}
