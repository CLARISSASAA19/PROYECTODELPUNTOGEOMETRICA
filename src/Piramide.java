
class Piramide extends Triangulo {
    private Punto punto4;

    public Piramide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3);
        this.punto4 = punto4;
    }


    ////quiero calcular el area de la piramide/////
    public double calcularArea() {

        double baseArea = super.calcularArea();

        double lado1 = Math.sqrt(Math.pow(punto1.x - punto2.x, 2) + Math.pow(punto1.y - punto2.y, 2));
        double lado2 = Math.sqrt(Math.pow(punto2.x - punto3.x, 2) + Math.pow(punto2.y - punto3.y, 2));
        double lado3 = Math.sqrt(Math.pow(punto3.x - punto1.x, 2) + Math.pow(punto3.y - punto1.y, 2));

        double perimetro = lado1 + lado2 + lado3;

        double altura = 2 * baseArea / perimetro;

        double areaBase = baseArea;
        double areaLateral = perimetro * altura;
        double areaTotal = areaBase + areaLateral;

        return areaTotal;
    }

    public double calcularVolumen() {

        double baseArea = super.calcularArea();
        double lado1 = Math.sqrt(Math.pow(punto1.x - punto2.x, 2) + Math.pow(punto1.y - punto2.y, 2));
        double lado2 = Math.sqrt(Math.pow(punto2.x - punto3.x, 2) + Math.pow(punto2.y - punto3.y, 2));
        double lado3 = Math.sqrt(Math.pow(punto3.x - punto1.x, 2) + Math.pow(punto3.y - punto1.y, 2));

        double perimetro = lado1 + lado2 + lado3;
        double altura = 2 * baseArea / perimetro;

        double volumen = (baseArea * altura) / 3;

        return volumen;
    }
}



