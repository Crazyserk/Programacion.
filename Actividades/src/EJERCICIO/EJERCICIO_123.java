package EJERCICIO;

import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO_123 {

    public static void main(String[] args) {
        /*Pide por teclado un número. Dicho número indica cuantos elementos se van a
          pedir a continuación. Almacena esas números en un ArrayList. A continuación:
          a) Muestra el contenido de la lista.
          b) Intercambia la primera posición con la última.
          c) Pide otra lista de números distinta como se indica al principio y añade todos suselementos a la lista inicial.
          Nota: al final sólo debe existir un arrayList con todos los valores juntos.
          d) Calcula la suma de todos los elementos de la lista.
          e) Calcula la media aritmética de los elementos de la lista.
          f) Muestra todos los valores de la lista que sean menores a la media antes calculada*/

        Scanner scanner = new Scanner(System.in);
        //Creamos la lista
        System.out.print("Introduce un número: ");
        int numElementos = scanner.nextInt();

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // Muestra el contenido de la lista
        System.out.println("Contenido de la lista:");
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }

        // Intercambia la primera posición con la última
        int temp = listaNumeros.get(0);
        listaNumeros.set(0, listaNumeros.get(listaNumeros.size() - 1));
        listaNumeros.set(listaNumeros.size() - 1, temp);

        // Muestra el contenido de la lista después del intercambio
        System.out.println("Contenido de la lista después del intercambio:");
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }

        // Pide otra lista de números y añade sus elementos a la lista original
        System.out.print("Introduce otro número: ");
        int numElementos2 = scanner.nextInt();
        for (int i = 0; i < numElementos2; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // Calcula la suma de todos los elementos de la lista
        int suma = 0;
        for (int numero : listaNumeros) {
            suma += numero;
        }
        System.out.println("La suma de todos los elementos de la lista es: " + suma);

        // Calcula la media aritmética de los elementos de la lista
        double media = (double) suma / listaNumeros.size();
        System.out.println("La media aritmética de los elementos de la lista es: " + media);

        // Muestra todos los valores de la lista que sean menores a la media antes calculada
        System.out.println("Valores de la lista menores que la media:");
        for (int numero : listaNumeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }
    }
}
