package ejercicio101;

import java.util.Scanner;

public class ejercicio102 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce un número entero N: ");
        int n = scanner.nextInt();
        scanner.close();

        try {
            char caracter = cadena.charAt(n);
            System.out.println("El carácter en la posición " + n + " es: " + caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No existe la posición " + n + " en la cadena");
        }
    }
}


