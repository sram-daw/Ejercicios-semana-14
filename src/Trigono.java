public abstract class Trigono {

    private String nombre;
    public Punto[] vertices = new Punto[3]; //No puede ser private porque luego va a tener que heredarlo Cuadrado

    public Trigono(Punto p1, Punto p2, Punto p3, String nombre) { //necesario para que Cuadrado pueda hacer uso de super en su constructor
        this.vertices[0] = p1;
        this.vertices[1] = p2;
        this.vertices[2] = p3;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Punto[] getVertices() { //No puede devolver int, tiene que devolver el objeto Punto
        return this.vertices;
    }

    public void setPuntos(Punto[] vertices) {
        this.vertices = vertices;
    }

    public void setVertices(Punto p1, Punto p2, Punto p3) { //asigna cada punto a un índice del array
    }
}
