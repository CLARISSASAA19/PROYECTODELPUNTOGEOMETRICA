import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del triángulo (punto1x, punto1y, punto2x, punto2y, punto3x, punto3y):");
        double punto1x = scanner.nextDouble();
        double punto1y = scanner.nextDouble();
        double punto2x = scanner.nextDouble();
        double punto2y = scanner.nextDouble();
        double punto3x = scanner.nextDouble();
        double punto3y = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(new Punto(punto1x, punto1y), new Punto(punto2x, punto2y), new Punto(punto3x, punto3y));
        double areaTriangulo = triangulo.calcularArea();
        System.out.println("El área del triángulo es: " + areaTriangulo);

        System.out.println("Ingrese las coordenadas de la pirámide (punto1x, punto1y, punto2x, punto2y, punto3x, punto3y, punto4z, punto4menosz):");
        double punto4z = scanner.nextDouble();
        double punto4menosz = scanner.nextDouble();

        Piramide piramide = new Piramide(new Punto(punto1x, punto1y), new Punto(punto2x, punto2y), new Punto(punto3x, punto3y), new Punto(punto4z, punto4menosz));
        double areaPiramide = piramide.calcularArea();
        double volumenPiramide = piramide.calcularVolumen();
        System.out.println("El área de la pirámide es: " + areaPiramide);
        System.out.println("El volumen de la pirámide es: " + volumenPiramide);
    }
}