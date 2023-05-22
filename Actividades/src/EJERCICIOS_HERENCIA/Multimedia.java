package EJERCICIOS_HERENCIA;

import java.util.Objects;

public class Multimedia {

    private String titulo;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String formato, int duracion) {
        this.titulo = titulo;
        if (formato.equals("mp3") || formato.equals("wav") || formato.equals("aac")
                || formato.equals("mp4") || formato.equals("mkv") || formato.equals("mov")
                || formato.equals("flv")) {
            this.formato = formato;
        } else {
            this.formato = "mp3";
        }
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{"
                + "titulo='" + titulo + '\''
                + ", formato='" + formato + '\''
                + ", duracion=" + duracion
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Multimedia) {
            Multimedia other = (Multimedia) obj;
            return this.formato.equals(other.formato) && this.duracion == other.duracion;
        }
        return false;
    }
}
