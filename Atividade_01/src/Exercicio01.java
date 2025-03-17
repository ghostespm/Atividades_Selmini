import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    /*
     * Método para encontrar um número repetido em um array de inteiros.
     * Utiliza dois laços aninhados para comparar cada elemento com os anteriores.
     * Complexidade: O(n²).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array (n >= 2):");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("O tamanho do array deve ser no mínimo 2.");
            return;
        }

        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Insira os " + n + " números no intervalo de 1 a " + (n - 1) + ":");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < 1 || num > n - 1) {
                System.out.println("Número fora do intervalo. Digite Novamente!!!");
                i--;
            } else {
                numeros.add(num);
            }
        }

        int repetido = encontrarRepetido(numeros);
        if (repetido != -1) {
            System.out.println("Número repetido = " + repetido);
        } else {
            System.out.println("Nenhum número repetido encontrado.");
        }

        scanner.close();
    }

    public static int encontrarRepetido(ArrayList<Integer> numeros) {
        ArrayList<Integer> vistos = new ArrayList<>();

        for (int num : numeros) {
            for (int v : vistos) {
                if (v == num) {
                    return num;
                }
            }
            vistos.add(num);
        }
        return -1;
    }
}
