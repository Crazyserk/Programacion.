package ejerciciosabst;

public class Perro extends Mamifero {

    private String raza;
    private String nombre;
    private boolean mezcla;

    public Perro(String raza, String nombre) {
        super(4, 1);
        this.raza = raza;
        this.nombre = nombre;
        this.mezcla = false;

    }

    public boolean getMezcla() {
        return mezcla;
    }

    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public String comunicarse() {

        return "ladridos";

    }

    @Override
    public String dormir() {

        return "duermo 18 horas";
    }

    public String jugar() {
        return nombre + "está jugando";
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + ", mezcla=" + mezcla + '}';
    }

}
