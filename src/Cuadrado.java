public class Cuadrado extends Cuadrilatero implements Forma {

    private double lado;

    public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4, String nombre) {
        super(p1, p2, p3, p4, nombre);
        this.lado = Math.sqrt(Math.pow(p2.getPos_x() - p1.getPos_x(), 2) + Math.pow(p2.getPos_y() - p1.getPos_y(), 2));

    }


    @Override
    public void dibujar_puntos() {

    }

    @Override
    public void rellenar_forma() {

    }

    @Override
    public double calcular_area() {
        return this.lado * this.lado;
    }

    @Override
    public double calcular_perimetro() {
        return this.lado * 4;
    }
}
