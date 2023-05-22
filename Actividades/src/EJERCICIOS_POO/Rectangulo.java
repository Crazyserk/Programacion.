package EJERCICIOS_POO;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerímetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        String texto = "Rectángulo con base" + base + "y con altura" + altura + "\n" + "Área = " + calcularArea() + "\n " +"Perímetro =" + calcularPerímetro();
        return texto;
    }

}
