package collections;

public class Zapato {

    private String modelo;
    private double precio;
    private int talla;

    public Zapato(String modelo, double precio, int talla) {
        this.modelo = modelo;
        this.precio = precio;
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTalla() {
        return talla;
    }
}
