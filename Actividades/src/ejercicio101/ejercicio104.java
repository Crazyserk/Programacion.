package ejercicio101;

import java.util.Scanner;

public class ejercicio104 {

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        System.out.print(
                "Ingrese el tamaño del vector: ");
        int size = text.nextInt();

        double[] vector = new double[size];

        int i = 0;
        while (i < size) {
            try {
                System.out.print("Ingrese un valor decimal para la posición " + i + ": ");
                double value = text.nextDouble();
                vector[i] = value;
                i++;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, por favor ingrese un valor decimal válido.");
                text.nextLine(); // para limpiar el buffer del scanner y evitar un bucle infinito
            }
        }

        System.out.println(
                "El vector final es: ");
        for (double element : vector) {
            System.out.print(element + " ");
        }

        text.close();
    }
}



