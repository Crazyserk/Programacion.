package P2T2;

public class Libro extends Epublicación {
// Introducimos propiedades -->

    private int numeroPaginas;
    private double precioBase;

    //Creamos el constructor -->
    public Libro(String title, String autor, double precioBase, int numeroPaginas, int PrecioVenta) {
        super(title, autor, precioBase);
        this.precioBase = precioBase;
        this.numeroPaginas = numeroPaginas;
    }

    //Implementamos el método para calcular PrecioFinal heredado -->
    public double calcularPrecioFinal(double ppp) {
        return super.calcularPrecioFinal(ppp, numeroPaginas) + (numeroPaginas * 2.17);
    }

    // Hacemos el toString con la siguiente cadena de texto -->
    public String toString() {
        return "Libro" + (super.toString()) + "" + numeroPaginas + "páginas" + calcularPrecioFinal(12, 10) + "€";
    }

}
