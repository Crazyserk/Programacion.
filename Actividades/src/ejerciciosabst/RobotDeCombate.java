package ejerciciosabst;

public class RobotDeCombate extends Robot {

    private int armadura;
    private boolean estadoArmadura;
    private String arma;

    public RobotDeCombate(int aguante, int velocidad, int potencia, int armadura, String arma) {
        super(aguante, velocidad, potencia);
        this.armadura = armadura;
        this.estadoArmadura = true;
        this.arma = arma;

    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public boolean getEstadoArmadura() {
        return estadoArmadura;
    }

    public void setEstadoArmadura(boolean estadoArmadura) {
        this.estadoArmadura = estadoArmadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void combatir(Robot roboto) {
        atacar();
        defender(roboto);
        if (getAguante() > 0) {
            setAguante(getAguante() - 1);
            setEstadoArmadura(false);
        }
    }

    @Override
    public void mostrar() {
        System.out.println("RobotDeCombate{" + "armadura=" + armadura + ", estadoArmadura=" + estadoArmadura + ", arma=" + arma + '}');
    }

    public void atacar() {
        System.out.println("Esta atacando");
    }

    public void defender(Robot defensor) {
        System.out.println("Esta defendiendo");
    }

}
