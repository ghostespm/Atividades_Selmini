import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Triangulo> triangulos = new ArrayList<>();

        System.out.println("Quantos triângulos deseja criar?");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nTriângulo " + (i + 1) + ":");
            double x1, y1, x2, y2, x3, y3;
            System.out.print("Vértice 1 (x1 y1): ");
            x1 = scanner.nextDouble();
            y1 = scanner.nextDouble();
            System.out.print("Vértice 2 (x2 y2): ");
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
            System.out.print("Vértice 3 (x3 y3): ");
            x3 = scanner.nextDouble();
            y3 = scanner.nextDouble();

            triangulos.add(new Triangulo(x1, y1, x2, y2, x3, y3));
        }

        System.out.println("\nResultados:");
        for (Triangulo tri : triangulos) {
            System.out.println(tri);
            System.out.println("----------------------");
        }

        scanner.close();
    }
}

class Triangulo {
    private final double x1, y1, x2, y2, x3, y3;

    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double Perimetro() {
        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        return lado1 + lado2 + lado3;
    }

    public double Area() {
        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double l = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(l * (l - lado1) * (l - lado2) * (l - lado3));
    }

    public double[] Centroide() {
        double centroideX = (x1 + x2 + x3) / 3;
        double centroideY = (y1 + y2 + y3) / 3;
        return new double[]{centroideX, centroideY};
    }

    @Override
    public String toString() {
        double[] centroide = Centroide();
        return String.format(
            "Vértices: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)\nÁrea: %.2f\nPerímetro: %.2f\nCentróide: (%.2f, %.2f)",
            x1, y1, x2, y2, x3, y3, Area(), Perimetro(), centroide[0], centroide[1]
        );
    }
}