
package CAFETERA;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000; // capacidad máxima predeterminada de la cafetera en 1000 cc
        cantidadActual = 0; // la cafetera comienza vacía
    }

    public void echarCafe(int cantidad) {
        if (cantidad > capacidadMaxima) { // si la cantidad excede la capacidad máxima, la cafetera se llena completamente
            cantidadActual = capacidadMaxima;
        } else {
            cantidadActual += cantidad; // se agrega la cantidad indicada al total actual
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima; // la cafetera se llena al máximo
    }

    public void vaciarCafetera() {
        cantidadActual = 0; // se tira todo el café de la cafetera
    }

    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) { // si la cafetera puede servir la taza indicada
            cantidadActual -= capacidadTaza; // se reduce la cantidad de café en la cafetera
            System.out.println("Se ha servido una taza de " + capacidadTaza + " cc de café."); // se indica que se ha servido la taza
        } else {
            System.out.println("No queda suficiente café en la cafetera para servir una taza de " + capacidadTaza + " cc."); // se indica que no hay suficiente café para servir la taza
        }
    }

    public void cantidadCafe() {
        System.out.println("Queda" + cantidadActual + "de café en la cafetera"); //Este método muestra exactamente cuantos café queda en la cafetera.
    }
}

