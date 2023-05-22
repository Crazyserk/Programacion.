package ejercicio101;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws Exception {
        if (this.nivel - cantidad < 0) {
            throw new Exception("No puedes quitar agua si ya no queda");
        } else {
            this.nivel -= cantidad;
        }
    }

    public void ponerAgua(int cantidad) throws Exception {
        if (this.nivel + cantidad > 0) {
            throw new Exception("No se puede agregar más agua, está llena");
        } else {
            this.nivel += cantidad;
        }
    }
}
