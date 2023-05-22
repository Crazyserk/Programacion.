package COLECCIONES;

public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private int peso;

    public Persona(String DNI, String nombre, String apellido, String sexo, int edad, int peso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String DNI) {
        this.DNI = DNI;
        this.nombre = "";
        this.apellido = "";
        this.sexo = sexo;
        this.edad = 0;
        this.peso = 0;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "DNI=" + DNI + "\nNombre:  " + nombre + ", \nApellido: " + apellido + ", \nSexo: " + sexo + ", \nEdad:" + edad + ", \nPeso:" + peso + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persona persona = (Persona) o;
        return DNI.equals(persona.DNI);

    }

    Object getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
