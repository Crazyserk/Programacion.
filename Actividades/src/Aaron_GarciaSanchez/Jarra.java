package Aaron_GarciaSanchez;

public class Jarra {

    private int cantidadActual;
    private int capacidadMaxima;

    public Jarra(int capacidadMaxima) { // Apartado A.
        if (capacidadMaxima <= 0) {
            this.capacidadMaxima = 10;

        } else {
            this.capacidadMaxima = capacidadMaxima;
        }
        this.cantidadActual = 0;
    }
// Apartado B, implementamos métodos.

    public int capacidad() {
        return capacidadMaxima;
    }

    public int contenido() {
        return cantidadActual;
    }

    public void vaciar() {
        cantidadActual = 0;
    }

    public void llenar() {
        cantidadActual = capacidadMaxima;
    }

    public void crearJarra() { // Apartado C, implementamos nueva jarra con una Capac.máxima de 6 L y CantidadActual vacía.
        this.capacidadMaxima = 6;
        this.cantidadActual = 0;
    }

    public Jarra(Jarra Copia) { //Apartado D, creamos el constructor de copia.
        this.capacidadMaxima = Copia.capacidadMaxima;
        this.cantidadActual = Copia.cantidadActual;
    }
// Apartado E, creamos el método para obtener la capacidad que necesitemos y a su vez, el método para cambiar la Capacidad Actual.

    public int obtenerCapacidad() {
        return capacidadMaxima - cantidadActual;
    }

    public void cambiarCantActual() {
        if (cantidadActual >= 0 && cantidadActual <= capacidadMaxima) {
            cantidadActual = capacidadMaxima - cantidadActual;

        }
    }

    @Override
    public String toString() {
        return "J --> " + "Capacidad Máxima: " + capacidadMaxima + ", cantidad actual: " + cantidadActual;
    }

}
