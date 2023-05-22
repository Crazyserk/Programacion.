package ejerciciosabst;

public abstract class Mamifero {

    private int numpatas;
    private int numvidas;

    public Mamifero(int numpatas, int numvidas) {
        this.numpatas = numpatas;
        this.numvidas = numvidas;

    }

    public abstract String comunicarse();

    public abstract String dormir();

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }

    public int getNumvidas() {
        return numvidas;
    }

    public void setNumvidas(int numvidas) {
        this.numvidas = numvidas;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numpatas=" + numpatas + ", numvidas=" + numvidas + '}';
    }

}
