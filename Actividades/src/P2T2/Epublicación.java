package P2T2;

public class Epublicación {

    //Introducimos propiedades --Z
    private String titulo;
    private String autor;
    private double PrecioVenta;

    //Creamos el constructor --> 
    public Epublicación(String title, String autor, double PrecioVenta) {
        this.titulo = title;
        this.autor = autor;
        this.PrecioVenta = PrecioVenta;

    }

    //Implementamos el método para calcular el PrecioFinal -->
    public double calcularPrecioFinal(double ppp, int numeropaginas) {
        double PrecioFinal;
        return PrecioFinal = PrecioVenta + (numeropaginas * ppp / 2);

    }

    //Hacemos el toString -->
    public String toString() {
        return "autor : " + "titulo : ";
    }

}
