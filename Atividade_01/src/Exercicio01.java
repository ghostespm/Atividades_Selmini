import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array (array maior ou igual a 2):");
        int n = scanner.nextInt();
        
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Insira os " + n + " números no intervalo de 1 a " + (n - 1) + ":");
        for (int i = 0; i < n; i++) {
            numeros.add(scanner.nextInt());
        }
        
        int repetido = repetido(numeros);
        System.out.println("Número repetido = " + repetido);
        
        scanner.close();
    }
    
    public static int repetido(ArrayList<Integer> numeros) {
        ArrayList<Integer> verifica = new ArrayList<>();
        for (int num : numeros) {
            for (int v : verifica) {
                if (v == num) {
                    return num;
                }
            }
            verifica.add(num);
        }
        return -1;
    }
}
