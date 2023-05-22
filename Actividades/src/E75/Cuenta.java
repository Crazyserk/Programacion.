

package E75;


public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }
    public Cuenta (String titular){
        this.titular=titular;
        this.cantidad=0;
    }
    public String gettitular(){
        return this.titular;
    }
    public void settitular(String nuevoTitular){
        this.titular=nuevoTitular;
    }
    public double getcantidad(){
        return this.cantidad;
    }
    public void setcantidad(double nuevacantidad){
        this.cantidad=nuevacantidad;
    }
    public void ingresar(int ingreso){
        if(ingreso>0){
            this.cantidad+=ingreso;
        }
    }
    public void retirar(int retirada){
        if(retirada>=this.cantidad){
            this.cantidad-=retirada;
        }else{
            System.out.println("Error! No hay suficiente dinero.");
        }
    }
    public String toString(){
        String res;
        res="";
        res+="Esta cuenta pertenece a "+this.titular+"\n";
        res+="Actualmente tiene un saldo de"+this.cantidad+".";
        
        
        
        
        
        
        
        
        return res;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    
    
}
/* int contador;

contador++;


*/
