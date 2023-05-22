package T3P3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Trabajadores {

    public static void main(String[] args) {

        Scanner trabajador = new Scanner(System.in);
        int trabajo = 0;

        ArrayList<Integer> horas = new ArrayList<Integer>(trabajo); //Para indicar la capacidad del array -->

        System.out.println(" Introduzca el numero de trabajadores que hay --> ");
        trabajo = trabajador.nextInt();

        for (int i = 0; i < trabajo; i++) {
            System.out.print(" Introduzca el numero de horas que trabajan semanalmente --> ");
            int valores = trabajador.nextInt();
            horas.add(valores);
        }

        //Para mostrar el contenido del ArrayList, valor por valor -->
        System.out.println(" Las horas de cada trabajador son --> ");
        for (int i = 0; i < horas.size(); i++) {
            System.out.println(horas.get(i));
        }

        // Para pedir otra lista de valores
        System.out.println(" Introduzca un numero --> ");
        int numero2 = trabajador.nextInt();

        // Añadir los números de la segunda lista al ArrayList -->
        for (int i = 0; i < numero2; i++) {
            System.out.println(" Introduzca los valores del Array --> ");
            int valores = trabajador.nextInt();
            horas.add(valores);
        }

        // Mostrar el contenido de la ArrayList, con los valores totales -->
        System.out.println(" Los valores finales son --> ");
        for (int i = 0; i < horas.size(); i++) {
            System.out.println(horas.get(i));
        }

        // Para hacer la suma de todos los elementos de la ArrayList, lo haríamos mediante un foreach (un bucle for mejorado y más eficiente)
        int sumatorio = 0;
        int contador = 0;
        for (int num : horas) {
            sumatorio += num;
            contador++;
        }
        System.out.println(" La suma de los valores es " + sumatorio);

        int resta = 0;
        int contador2 = 0;
        for (int num : horas) {
            resta -= num;
            contador++;
        }
        System.out.println(" La resta de los valores es " + resta);
    }
}
