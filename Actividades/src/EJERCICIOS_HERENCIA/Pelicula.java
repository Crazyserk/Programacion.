package EJERCICIOS_HERENCIA;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + "titulo='" + getTitulo() + '\''
                + ", formato='" + getFormato() + '\''
                + ", duracion=" + getDuracion()
                + ", actorPrincipal='" + actorPrincipal + '\''
                + ", actrizPrincipal='" + actrizPrincipal + '\''
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pelicula) {
            Pelicula other = (Pelicula) obj;
            return super.equals(other)
                    && this.actorPrincipal.equals(other.actorPrincipal)
                    && this.actrizPrincipal.equals(other.actrizPrincipal);
        }
        return false;
    }
}
