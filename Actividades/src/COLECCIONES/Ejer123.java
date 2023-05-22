package COLECCIONES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer123 {

    /* Pide por teclado un número. Dicho número indica cuantos elementos se van a
pedir a continuación. Almacena esas números en un ArrayList. A continuación:
a) Muestra el contenido de la lista.
b) Intercambia la primera posición con la última.
c) Pide otra lista de números distinta como se indica al principio y añade todos sus
elementos a la lista inicial. Nota: al final sólo debe existir un arrayList con todos los
valores juntos.
d) Calcula la suma de todos los elementos de la lista.
e) Calcula la media aritmética de los elementos de la lista.
f) Muestra todos los valores de la lista que sean menores a la media antes
calculada. */
    public static void main(String[] args) {

        //Pedimos por teclado un número --> 
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>(numero); //Para indicar la capacidad del array -->

        System.out.println("Introduzca el tamaño del array : ");
        numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("Introduzca los valores del array: ");
            int valores = teclado.nextInt();
            numeros.add(valores);
        }

        //Para mostrar el contenido del arrayList, valor por valor -->
        System.out.println("Los valores del array son: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Para intercambiar la primera posición con la última
        Collections.swap(numeros, 0, numeros.size() - 1);

        // Mostrar el contenido habiendo hecho el cambio -->
        System.out.println(" Los valores cambiados son --> ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Para pedir otra lista de números
        System.out.println(" Introduzca un numero --> ");
        int numero2 = teclado.nextInt();

        // Añadir los números de la segunda lista al ArrayList -->
        for (int i = 0; i < numero2; i++) {
            System.out.println(" Introduzca los valores del Array --> ");
            int valores = teclado.nextInt();
            numeros.add(valores);
        }

        // Mostrar el contenido de la ArrayList, con los valores totales -->
        System.out.println(" Los valores finales son --> ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Para hacer la suma de todos los elementos de la ArrayList, lo haríamos mediante un foreach (un bucle for mejorado y más eficiente)
        int suma = 0;
        int contador = 0;
        for (int num : numeros) {
            suma += num;

        }

        System.out.println(" La suma de los valores es " + suma);

    }
}
