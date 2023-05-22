package T3P3;

import java.util.Objects;

public class zapatilla {

    private double precio;
    private double peso;
    private int anchura;
    private double talla;
    private String modelo;

    public zapatilla(double precio, double peso, int anchura, double talla, String modelo) {
        this.precio = precio;
        this.peso = peso;
        this.anchura = anchura;
        this.talla = talla;
        this.modelo = modelo;
    }

    public zapatilla(String modelo) {
        this.precio = precio;
        this.peso = peso;
        this.anchura = anchura;
        this.talla = talla;
        this.modelo = modelo;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final zapatilla other = (zapatilla) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.anchura != other.anchura) {
            return false;
        }
        if (Double.doubleToLongBits(this.talla) != Double.doubleToLongBits(other.talla)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        return "precio : " + precio + ", peso : " + peso + ", anchura : " + anchura + ", talla : " + talla + ", modelo : " + modelo + '}';
    }

}
