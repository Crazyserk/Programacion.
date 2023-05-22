package Herencia;

public class Tecnico extends Operario {

    public Tecnico(String nombre, int codigoTrabajador) {
        super(nombre, codigoTrabajador);
    }

    @Override
    public String toString() {
        return "Soy el técnico" + getNombre() + "con el código" + getCodigoTrabajador();
    }

}
