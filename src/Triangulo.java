
import java.util.Scanner;

class Triangulo {
    protected Punto punto1;
    protected Punto punto2;
    protected Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public double calcularArea() {
        double area = 0.5 * ((punto1.x - punto3.x) * (punto2.y - punto1.y) - (punto1.x - punto2.x) * (punto3.y - punto1.y));
        return area;
    }
}


