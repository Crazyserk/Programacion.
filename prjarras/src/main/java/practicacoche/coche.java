package practicacoche;

public class coche {
    // Atributos --> Caracteriscas que va a tener

    private String color;
    private double anchura;
    private double altura;
    private int numerodepuertas;
    private int ruedas;
    private boolean arrancado;
    private int gasolina;

// Constructores --> funcion que da vida al objeto 
    public coche(String color, double anchura, double altura, int numerodepuertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numerodepuertas = numerodepuertas;
        this.ruedas = 4;
    }
// Getters&Setters --> Funciones para obtener valores y darlos 

// Metodos personalizados --> Definir funciones que te piden
    public void arrancar() {
        if (chequear() == true) {
            System.out.println("El coche ya está arrancado");
        } else {
            System.out.println("El coche se ha arrancado");
            if (gasolina > 0 && gasolina < 50) {
                arrancado = true;
                gasolina = gasolina - 5;
            }
        }
    }

    public void parar() {
        if (arrancado == true) {
            System.out.println("El coche se ha parado");
            arrancado = false;
        } else {
            System.out.println("El coche ya está parado");

        }

    }

    public void desplazarse() {
        if (arrancado == true) {
            System.out.println("El coche se puede mover");

        } else {
            System.out.println("El coche no se puede mover");
            if (gasolina > 0 && gasolina < 50) {
                gasolina = gasolina - 20;
            }
        }
    }

    public void echargasolina(int cantidad) {
        arrancado = false;
        gasolina = gasolina + cantidad;
    }

    public boolean chequear() {
        boolean res;
        if (gasolina > 0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public void pintar(String colornuevo) {
        color = colornuevo;
    }

    @Override
    public String toString() {
        return "coche{" + "color=" + color + ", anchura=" + anchura + ", altura=" + altura + ", numerodepuertas=" + numerodepuertas + ", ruedas=" + ruedas + '}';
    }

}
// ToString --> Sobreescribir un metodo (ya existen) para dar la información de la clase

