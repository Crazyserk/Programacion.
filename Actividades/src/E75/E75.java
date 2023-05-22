
package E75;

public class E75 {

    public static void main(String[] args) {
        
        Cuenta cuenta1=new Cuenta ("miguel" , 2000);

        cuenta1.settitular("Miguel");
        
        double cantidadActual= cuenta1.getcantidad();
        
        double nuevaCantidad=cantidadActual*1.2;
        
        cuenta1.setcantidad(nuevaCantidad);
        
        System.out.println(cuenta1);
        
        
        System.out.println(cuenta1.gettitular());
        
        cuenta1.setTitular("Alvaro");
        cuenta1.setcantidad(3000.00);
        
        System.out.println(cuenta1);
        
        System.out.println(cuenta1.getcantidad());
        System.out.println(cuenta1.gettitular());
        
        System.out.println(cuenta1);
        

    }

}
