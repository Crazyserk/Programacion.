package ejercicio101;

import java.util.Scanner;

public class ejercicio105 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Introduzca el numerador");
            int numerador = teclado.nextInt();
            System.out.println("Introduzca el denominador");
            int denominador = teclado.nextInt();

            double cociente = (double) numerador / denominador;
            if (numerador <= 100 && denominador >= -5) {
                System.out.println("El cociente es" + cociente);
            } else {
                throw new Exception("El numerador debe ser menor que 100 y el denominador mayor que -5");
            }

        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }

    }

}
