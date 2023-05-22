package EJERCICIOS_POO;

public class Cafetera {

    //atributos
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public void EcharCafe(int cantidad) {
        if (cantidad > capacidadMaxima) {
            capacidadActual = capacidadMaxima;
        } else {
            capacidadActual = cantidad;
        }
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
    }

    public void vaciarCafetera() {
        capacidadActual = 0;
    }

    public void servirTaza(int capacidadTaza) {
        if (capacidadActual >= capacidadTaza) {
            capacidadActual = capacidadActual - capacidadTaza;
        }
    }
    public void CantidadCafe(){
        System.out.println("Queda" + capacidadActual + " cc de cafe en la cafetera");
    }
}
