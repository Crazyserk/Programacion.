package prJarras;

public class jarras {

    private final int capacidad;
    private int cantidad;

    public jarras(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            throw new RuntimeException("Error, capacidad incorrecta.");
        }
        capacidad = capacidadInicial;
        cantidad = 0;
    }

    public int capacidad() {
        return capacidad;
    }

    public int cantidad() {
        return cantidad;
    }

    public void llena() {
        cantidad = capacidad;
    }

    public void vacia() {
        cantidad = 0;
    }

    public void llenaDesde(jarras j) {
        int cantidadMinima = Math.min(capacidad - cantidad, j.cantidad);

        cantidad += cantidadMinima;
        j.cantidad -= cantidadMinima;
    }

    @Override
    public String toString() {
        String frase = " capacidad de " + capacidad + " y cantidad de " + cantidad + " de líquido.";
        return frase;
    }
}
