package Aaron_GarciaSanchez;

public class Libro {

//Hacemos el constructor
    private String autor;
    private String titulo;
    private double preciobase;

    public Libro(String titulo, String autor, double preciobase) {
        this.autor = autor;
        this.titulo = titulo;
        this.preciobase = preciobase;

    }
// Creamos los getters y setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }
    // Creamos el método calcularPrecioFinal.

    public double calcularPrecioFinal(double IVA) {
        double PrecioFinal = preciobase + (preciobase * IVA / 100);
        return PrecioFinal;
    }
// Aplicamos el método toString para devolver textualmente la representación del libro.

    @Override
    public String toString() {
        return "Libro --> " + "titulo: " + titulo + ", autor: " + autor + ", preciobase: " + preciobase + '}';
    }

}
