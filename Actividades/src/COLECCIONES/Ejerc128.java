package COLECCIONES;

import java.util.ArrayList;
import java.util.Scanner;

/* 128.- La empresa MEDAC te ha elegido para crear un programa que se encargue de
registrar los sueldos de los hombres y las mujeres que trabajan allí, con el fin de detectar
si existe brecha salarial entre ambos.
Para ello, el programa pedirá primero el número total de trabajadores de la empresa por
teclado (N) y, posteriormente, solicitará información de cada persona de la siguiente
forma:
• pedirá su género (0 para varón y 1 para mujer)
• pedirá su sueldo anual en euros.
Esta información debe guardarse en un diccionario. Finalmente, el programa mostrará
por pantalla el sueldo medio de cada género*/
public class Ejerc128 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduzca el numero total de trabajadores de la empresa ");
        int tTotales = teclado.nextInt();

        ArrayList<Integer> varones = new ArrayList<>();
        ArrayList<Integer> mujeres = new ArrayList<>();

        int genero = 0;

        for (int i = 0; i < tTotales; i++) {
            do {
                System.out.println(" Introduzca un género --> ");
                genero = teclado.nextInt();

                System.out.println(" Introduzca el sueldo anual en euros -->");
                int sueldo = teclado.nextInt();

                if (genero == 0) {
                    varones.add(sueldo);
                } else if (genero == 1) {
                    mujeres.add(sueldo);
                }
                if (genero < 0 || genero > 1) {
                    System.out.println(" Error, datos no validos.. ");
                }

            } while (genero < 0 || genero > 1);
            
        }
        int suma = 0;
        int contador = 0;
        for (int num : varones){
            suma += num;
            contador++;
        }
        int suma2= 0;
        int contador2 = 0;
        for (int num : mujeres){
            
          suma2 += num;
          contador2++;
        }
        System.out.println("El sueldo total de los varones es " + suma);
        
        System.out.println(" La media de los varones es " + suma / contador);
        
        System.out.println("El sueldo total de las mujeres es " + suma2);
        
        System.out.println(" La media de las mujeres es" + suma2 / contador2);
    }
}
