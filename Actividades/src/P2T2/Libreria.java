package P2T2;

public class Libreria {

    // Implementamos las propiedades con un array de libros
    private int numlibros;
    private int capacidadtotal_Libreria;
    private Libro[] libros;

    // Construimos un objeto Librería sin libros, con la capacidadinicial de 18.
    public Libreria() {
        this(18);
    }

    // Construimos un objeto Librería sin libros, que cuando el valor es menor que 1, se creará una librería con el constructor.
    public Libreria(int capacidadinicial) {
        if (capacidadinicial < 1) {
            capacidadinicial = 18;
        } else {
            this.libros = new Libro[capacidadinicial];
            this.numlibros = 0;
            this.capacidadtotal_Libreria = capacidadinicial;
        }
    }
// Implementamos este método para añadir algún libro

    public boolean addlibro(Libro librito) {
        if (numlibros < capacidadtotal_Libreria) {
            libros[numlibros] = librito;
            numlibros++;
            return true;
        } else {
            return false;
        }
    }
// Método que implementamos para borrar un libro. -->

    public String borrarLibro(Libro libro) {
        for (int i = 0; i < numlibros; i++) {
            if (libros[i] == (libro)) {
                libros[i] = null;
                numlibros--;
                return "El libro fue borrado";
            }
        }
        return "Libreria actualizada";
    }

    // Implementamos este método para actualizar la base de datos de la Librería. -->
    private void actualizarlibros(int Libros) {
        for (int i = Libros; i < numlibros; i++) {
            libros[i] = libros[i + 1];
        }
    }

    // Implementamos este método para mirar si hay un libro en nuestra librería , si no está en la librería devuelve un -11 (return -11;) --> 
    public int BuscarLibro(Libro librillo) {
        for (int i = 0; i < numlibros; i++) {
            if (libros[i] == (librillo)) {
                return i;
            }
        }
        return -11;
    }
    // Implementamos el toString para devolver textualmente la representación del objeto librería;
    @Override
    public String toString() {
        return " Libreria con " + numlibros + "libros de " + capacidadtotal_Libreria + " totales ";
    }
    
    //PD --> No se como implementar la cadena de texto de los libros almacenados.. ):
    

}
