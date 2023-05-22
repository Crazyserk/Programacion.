
package COCHECITO;

public class Coche {
    private static final double GASTOS_MATR = 100.0; //Constante de clase 
    private static double iva = 10.0;
    private static int refCnt= 1;
    private final int referencia;
    private final String modelo;
    private double precio;
    public Coche(String m){
        this(m, 0.0); //Coche(String m , double P)
    }
    public Coche(String m,double p){
        modelo=m;   
        precio=p;
        referencia = refCnt;
        ++refCnt;
    }
    public double calcPrecioFinal(){
        double p = GASTOS_MATR + getPrecioBase();
        return p + p * getIva()/100.0;
    }
    public int getRef(){
        return referencia;
    }
    public String getModelo(){
        return modelo;
    }
    protected double getPrecioBase(){
        return precio;
    }
    public void setPrecioBase(double v){
        precio = v;
    }
    public static double getIva(){
        return iva;
    }
    public static void setIva(double v){
        iva =v;
    }
    @Override
    public String toString(){
        return"(" + getRef() + "," + getModelo() + "," + calcPrecioFinal()+ ")";
    }
}
