package ejercicio101;

import java.util.Random;

public class testPiscina {

    public static void main(String[] args) throws Exception {

        Random ramd = new Random();
        int top = ramd.nextInt(100) + 1;
        Piscina piscinita = new Piscina(top);
        System.out.println("Se creó una piscina con" + top);
        int cantidad;
        for (int i = 0; i < 5; i++) {
            cantidad = ramd.nextInt(25) + 1;
            try {
                piscinita.ponerAgua(cantidad);
                System.out.println("Se añadió" + cantidad + "L de agua" + piscinita.getNivel());
            } catch (Exception e) {
                System.out.println("Error" + e.toString());
            }
        }

        for (int i = 0; i < 5; i++) {
            cantidad = ramd.nextInt(25) + 1;
            try {
                piscinita.quitarAgua(cantidad);
                System.out.println("Se ha quitado" + cantidad + "L de agua" + piscinita.getNivel());

            } catch (Exception e) {
                System.out.println("Error" + e.toString());
            }
        }
    }
}
