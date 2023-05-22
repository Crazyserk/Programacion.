package Herencia;

public class Operario extends Empleado {

    private int codigoTrabajador;

    public Operario(String nombre, int codigoTrabajador) {
        super(nombre);
        this.codigoTrabajador = codigoTrabajador;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    @Override
    public String toString() {
        return "Soy el operario" + getNombre() + "con el código" + getCodigoTrabajador();
    }
}
