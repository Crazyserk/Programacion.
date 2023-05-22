package EJERCICIOS_POO;

public class Coche {

    private String color;
    private int altura;
    private int anchura;
    private int numPuertas;
    private int numRuedas = 4;
    private int gasolina = 0;
    private boolean arrancado = false;

    public Coche(String color, int altura, int anchura, int numPuertas) {
        this.color = color;
        this.altura = altura;
        this.anchura = anchura;
        this.numPuertas = numPuertas;
    }

    public void arrancar() {
        if (!arrancado && gasolina >= 5) {
            arrancado = true;
            gasolina -= 5;
            System.out.println("Coche arrancado");
        } else {
            System.out.println("No se pudo arrancar el coche");
        }
    }

    public void parar() {
        if (arrancado) {
            arrancado = false;
            System.out.println("Coche parado");
        } else {
            System.out.println("No se pudo parar el coche");
        }
    }

    public void desplazarse() {
        if (arrancado && gasolina >= 20) {
            gasolina -= 20;
            System.out.println("Coche en movimiento");
        } else {
            System.out.println("No se pudo desplazar el coche");
        }
    }

    public void echarGasolina(int cantidad) {
        if (!arrancado) {
            gasolina = Math.min(gasolina + cantidad, 50);
            System.out.println("Gasolina añadida correctamente");
        } else {
            System.out.println("No se puede echar gasolina con el coche arrancado");
        }
    }

    public boolean chequear() {
        return gasolina > 0;
    }

    public void pintar(String color) {
        this.color = color;
        System.out.println("Coche pintado de " + color);
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", altura=" + altura + ", anchura=" + anchura + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", gasolina=" + gasolina + ", arrancado=" + arrancado + '}';
    }

}

