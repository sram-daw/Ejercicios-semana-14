public class Main {
    public static void main(String[] args) {
        Punto punto1Cuad = new Punto(10, 15);
        Punto punto2Cuad = new Punto(20, 30);
        Punto punto3Cuad = new Punto(30, 5);
        Punto punto4Cuad = new Punto(35, 40);

        Punto punto1Rec = new Punto(10, 20);
        Punto punto2Rec = new Punto(30, 25);
        Punto punto3Rec = new Punto(5, 14);
        Punto punto4Rec = new Punto(5, 14);

        Punto punto1Tria = new Punto(5, 14);
        Punto punto2Tria = new Punto(18, 25);
        Punto punto3Tria = new Punto(23, 18);

        Cuadrado nuevoCuadrado = new Cuadrado(punto1Cuad, punto2Cuad, punto3Cuad, punto4Cuad, "cuadrado");
        Rectangulo nuevoRectangulo = new Rectangulo(punto1Rec, punto2Rec, punto3Rec, punto4Rec, "rectángulo");
        Triangulo nuevoTriangulo = new Triangulo(punto1Tria, punto2Tria, punto3Tria, "triángulo rectángulo");

        Forma[] conjuntoFormas = new Forma[3];
        conjuntoFormas[0] = nuevoCuadrado;
        conjuntoFormas[1] = nuevoRectangulo;
        conjuntoFormas[2] = nuevoTriangulo;

        for (Forma f : conjuntoFormas) {
            if (f instanceof Cuadrilatero) {
                f.dibujar_puntos();
                f.rellenar_forma();
                System.out.println("El área del " + ((Cuadrilatero) f).getNombre() + "es igual a " + f.calcular_area() + " y el perímetro es igual a " + f.calcular_perimetro());
            } else if (f instanceof Trigono) {
                f.dibujar_puntos();
                f.rellenar_forma();
                System.out.println("El área del " + ((Trigono) f).getNombre() + " es igual a " + f.calcular_area() + " y el perímetro es igual a " + f.calcular_perimetro());

            }
        }
    }
}