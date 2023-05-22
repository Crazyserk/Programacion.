package ejerciciosabst;

public class Gato extends Mamifero {

    private String nombre;
    private String pelaje;

    public Gato(String nombre) {
        super(4, 7);
        this.nombre = nombre;
        this.pelaje = "corto";

    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String comunicarse() {
        return "miau";
    }

    @Override
    public String dormir() {
        return "duermo 15 horas al día";

    }

    public String cazar() {
        return "Mi gato de " + getNumpatas() + "patas está cazando";
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", pelaje=" + pelaje + '}';
    }

}
