/*
Crea un array de tamaño 100 (notas)
Mete valores aleatorios entre 1 y 100
Crea otro array diferente que contenga los numeros pares del primer array
Muestralo por pantalla
 */

public class Actividades {

    public static void main(String[] args) {
        int contadorPares = 0;
        // Crear array original tamaño 100
        int[] arr = new int[100];

        // Meter valores aleatorios entre 1 y 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            // Contar los pares
            if (arr[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Crear array con tanto tamaño como numeros pares hay
        int[] arrayPares = new int[contadorPares];

        // Recorrer array original
        int indiceArrayPares = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                arrayPares[indiceArrayPares] = arr[j];
                indiceArrayPares++;
            }
        }

        // Imprimir array resultante
        for (int k = 0; k < arrayPares.length; k++) {
            System.out.print(arrayPares[k] + " ");
        }
        System.out.print("\n");

    }
}
