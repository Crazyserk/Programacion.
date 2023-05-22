package Herencia;

public class Oficial extends Operario {

    public Oficial(String nombre, int codigoTrabajador) {
        super(nombre, codigoTrabajador);
    }

    @Override
    public String toString() {
        return "Soy el oficial" + getNombre() + "con el código" + getCodigoTrabajador();
    }

}
