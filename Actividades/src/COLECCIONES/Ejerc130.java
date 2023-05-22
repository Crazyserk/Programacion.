
package COLECCIONES;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ejerc130 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String linea;
        Map<String, Integer> cuentaPalabras = new HashMap<>();

        // Lee el texto línea a línea hasta que se introduzca una línea vacía
        do {
            System.out.print("Introduce una línea de texto: ");
            linea = teclado.nextLine();

            // Separa la línea en palabras individuales
            String[] palabras = linea.split("\\s+");

            // Actualiza el conteo de cada palabra
            for (String palabra : palabras) {
                // Convertir todas las letras a minúsculas para ignorar diferencias entre mayúsculas y minúsculas
                palabra = palabra.toLowerCase();
                if (cuentaPalabras.containsKey(palabra)) {
                    cuentaPalabras.put(palabra, cuentaPalabras.get(palabra) + 1);
                } else if (!palabra.equals("")) {
                    cuentaPalabras.put(palabra, 1);
                }
            }
        } while (!linea.equals(""));

        // Imprime el número de apariciones de cada palabra
        for (String palabra : cuentaPalabras.keySet()) {
            System.out.println(palabra + ": " + cuentaPalabras.get(palabra));
        }

    }

}
    
    

