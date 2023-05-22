
package COCHECITO;

public class testcoche {

    public static void main(String[] args) {
         Coche c1= new Coche("Seat", 12000);
         Coche c2 = new Coche("Lexus", 40000);
         
         System.out.println("IVA" + Coche.getIva());
         System.out.println(c1.toString());
         System.out.println(c2.toString());
         
         Coche.setIva(20);
         c1.setPrecioBase(15000);
         
         System.out.println("IVA" + Coche.getIva());
         System.out.println(c1);
         System.out.println(c2);
    }
    
}
