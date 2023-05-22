package T3P3;

import java.util.ArrayList;
import java.util.Scanner;

public class SHOP {

    private ArrayList<zapatilla> tiendazapatillus;

    public SHOP() {
        tiendazapatillus = new ArrayList<zapatilla>();
    }

    public static void main(String[] args) {

        SHOP zapateria = new SHOP();
        Scanner tienda = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. Meter modelo ");
            System.out.println(" 2. Borrar modelo ");
            System.out.println(" 3. Buscar modelo ");
            System.out.println(" 4. Salir ");

            int opcion = tienda.nextInt();
            tienda.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println(" Introduzca el modelo de la zapatilla : ");
                    String modelo = tienda.nextLine();

                    System.out.println(" Introduzca el peso de la zapatilla : ");
                    double peso = tienda.nextDouble();

                    System.out.println(" Introduzca la anchura de la zapatilla : ");
                    int anchura = tienda.nextInt();

                    System.out.println(" Introduzca el precio de la zapatilla : ");
                    double precio = tienda.nextDouble();

                    System.out.println(" Introduzca la talla de la zapatilla : ");
                    int talla = tienda.nextInt();
                    break;
                case 2:
                    System.out.println(" Elige el modelo que quieres borrar --> ");
                    tienda.nextLine();
                    System.out.println(" Modelo borrado de la BBDD del sistema.. ");
                    
            }

        }
    }
}
