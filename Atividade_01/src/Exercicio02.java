import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor para verificação:");
        int n = scanner.nextInt();
        ArrayList<Integer> vetor = new ArrayList<>();
        
        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            vetor.add(scanner.nextInt());
        }
        
        boolean existeSoma = SomaAnterior(vetor);
        if (!existeSoma) System.out.println("Nenhum elemento é a soma de dois anteriores.");
        
        scanner.close();
    }
    
    public static boolean SomaAnterior(ArrayList<Integer> vetor) {
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
}
