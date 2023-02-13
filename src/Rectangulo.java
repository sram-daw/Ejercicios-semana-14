public class Rectangulo extends Cuadrilatero implements Forma {

    private double base;
    private double altura;

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4, String nombre) { //se enumeran los puntos de izquierda a derecha y de arriba a abajo
        super(p1, p2, p3, p4, nombre);
        this.base = Math.sqrt(Math.pow(p4.getPos_x() - p3.getPos_x(), 2) + Math.pow(p4.getPos_y() - p3.getPos_y(), 2));
        this.altura = Math.sqrt(Math.pow(p3.getPos_x() - p1.getPos_x(), 2) + Math.pow(p3.getPos_y() - p1.getPos_y(), 2));

    }


    @Override
    public void dibujar_puntos() {

    }

    @Override
    public void rellenar_forma() {

    }

    @Override
    public double calcular_area() {
        return this.base * this.altura;
    }

    @Override
    public double calcular_perimetro() {
        return (this.base * 2) + (this.altura * 2);
    }
}
