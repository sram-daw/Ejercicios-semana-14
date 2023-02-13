public class Triangulo extends Trigono implements Forma {

    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(Punto p1, Punto p2, Punto p3, String nombre) {
        super(p1, p2, p3, nombre);
        this.lado1 = Math.sqrt(Math.pow(p2.getPos_x() - p1.getPos_x(), 2) + Math.pow(p2.getPos_y() - p1.getPos_y(), 2));
        this.lado2 = Math.sqrt(Math.pow(p3.getPos_x() - p2.getPos_x(), 2) + Math.pow(p3.getPos_y() - p2.getPos_y(), 2));
        this.lado3 = Math.sqrt(Math.pow(p3.getPos_x() - p1.getPos_x(), 2) + Math.pow(p3.getPos_y() - p1.getPos_y(), 2));
    }



    @Override
    public void dibujar_puntos() {

    }

    @Override
    public void rellenar_forma() {

    }

    @Override
    public double calcular_area() {
        return this.lado1 * this.lado2 / 2;
    }

    @Override
    public double calcular_perimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}
