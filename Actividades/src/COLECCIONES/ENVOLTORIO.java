package COLECCIONES;

public class ENVOLTORIO {

    public static void main(String[] args) {
        /* CLASES ENVOLTORIO
        Integer --> int
        Double --> double
        Boolean --> Booleanos
        Character --> Char
        */
        
        // Creamos la variable int
        int numeroEntero = 10;
        
        // Encapsulamos el objeto en un objeto Integer
        Integer manolito = Integer.valueOf(numeroEntero);
        
       // Realizamos una operación matemática con el objeto Integer
        int resultado = manolito * 30 / 5;
        
        // Imprimimos el "resultado"
        System.out.println(resultado);
    }

                   }
