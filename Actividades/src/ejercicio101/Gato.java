package ejercicio101;

public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("Debe tener 3 caracteres como minimo");
        }
        if (edad < 0) {
            throw new Exception("No puede ser negativa");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("Debe de tener el nombre 3 caracteres");
        }

        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception(" NO PUEDE SER NEGATIVA");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El gatito" + nombre + "tiene" + edad + "años de edad";
    }

}
