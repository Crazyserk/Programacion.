package ejercicio101;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ejerc45 {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            Random num = new Random();
            int piensanumero = num.nextInt(100) + 1;
            int numusuario;

            System.out.println("Se piensa un número entre 1 y 100");

            do {
                System.out.println("Introduce el numero ");
                numusuario = teclado.nextInt();
                if (numusuario > piensanumero) {
                    System.out.println("te has pasado!");
                } else if (numusuario < piensanumero) {
                    System.out.println("Te has quedado corto!!");
                } else {
                    System.out.println("Lo has logrado!");

                }
            } while (numusuario != piensanumero);
            teclado.close();

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error en el formato introducido, ingresa un numero." + e.toString());
        }

    }
}
