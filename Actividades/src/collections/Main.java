package collections;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TiendaDeZapatos tienda = new TiendaDeZapatos();

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Agregar un zapato");
            System.out.println("2. Buscar un zapato");
            System.out.println("3. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    tienda.agregarZapato();
                    break;
                case 2:
                    tienda.buscarZapato();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
