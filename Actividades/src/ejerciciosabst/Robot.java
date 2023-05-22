package ejerciciosabst;

public abstract class Robot {

    private int aguante;
    private int velocidad;
    private int potencia;

    public Robot(int aguante, int velocidad, int potencia) {
        this.aguante = aguante;
        this.velocidad = velocidad;
        this.potencia = potencia;

    }

    public int getAguante() {
        return aguante;
    }

    public void setAguante(int aguante) {
        this.aguante = aguante;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public abstract void combatir(Robot roboto);

    public abstract void mostrar();
}
