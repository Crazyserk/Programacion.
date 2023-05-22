package ejercicio101;

import java.util.Scanner;

public class MenuNumerosEnteros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int numero = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ingresar un número entero");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    numero = scanner.nextInt();
                    System.out.println("Ha ingresado el número " + numero);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 2);
        scanner.close();
    }
}
