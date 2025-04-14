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
            System.out.println("Informe as coordenadas do vértice A (x1, y1):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            System.out.println("Informe as coordenadas do vértice B (x2, y2):");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            
            System.out.println("Informe as coordenadas do vértice C (x3, y3):");
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

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

    public double perimetro() {
        double a = distancia(x1, y1, x2, y2);
        double b = distancia(x2, y2, x3, y3);
        double c = distancia(x3, y3, x1, y1);
        return a + b + c;
    }

    public double area() {
        double a = distancia(x1, y1, x2, y2);
        double b = distancia(x2, y2, x3, y3);
        double c = distancia(x3, y3, x1, y1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double[] centroide() {
        double a = distancia(x1, y1, x2, y2);
        double b = distancia(x2, y2, x3, y3);
        double c = distancia(x3, y3, x1, y1);
        double centroideX = (a * x2 + b * x1 - c * x3) / (a + b + c);
        double centroideY = (a * y2 + b * y1 - c * y3) / (a + b + c);
        return new double[]{centroideX, centroideY};
    }

    private double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public String toString() {
        double[] centroide = centroide();
        return String.format(
            "Vértices: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)\nÁrea: %.2f\nPerímetro: %.2f\nCentróide: (%.2f, %.2f)",
            x1, y1, x2, y2, x3, y3, area(), perimetro(), centroide[0], centroide[1]
        );
    }
}

