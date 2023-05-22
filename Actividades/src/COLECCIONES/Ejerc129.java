package COLECCIONES;

import java.util.HashMap;
import java.util.Scanner;


public class Ejerc129 {
    
    
    /* Crea un programa que vaya solicitando nombres de diferentes alumnos junto con
su nota media del curso hasta que el nombre sea igual a “fin” (minúsculas).
Almacena todos esos datos en una estructura tipo diccionario y muestra cada alumno
con su nota en una línea.
A continuación sube un punto la nota de aquellos alumnos cuyo nombre empiecen por
‘J’ y borra aquellos cuyo nombre empiecen ‘A’ o por ‘D’
Para finalizar, si la estructura no está vacía, muestra solo las notas y la media de todas
ellas*/
    
    public static void main(String[] args) {
        
        Scanner tfc = new Scanner (System.in);
        String alumnos = "";
        double media = 0;
        
        //Estructura diccionario
        HashMap<String, Double> diccionario = new HashMap<>();
        do{
            System.out.println(" Introduzca nombres de los alumnos --> ");
            alumnos = tfc.nextLine();
            if (!alumnos.equals("fin")) {
                do {
                    System.out.println("Introduzca la media del alumno: ");
                    media = tfc.nextInt();
                } while (media < 0 || media > 10);
            }
            diccionario.put(alumnos, media);
        } while (!alumnos.equals("fin"));
        
        // Subir la nota de los alumnos cuyo nombre empieza por "J"
        for (String key : diccionario.keySet()) {
            if (key.startsWith("J")) {
                double nuevaNota = diccionario.get(key) + 1;
                diccionario.replace(key, nuevaNota);
            }
        }
        
        // Borrar los alumnos cuyo nombre empieza por "A" o "D"
        diccionario.keySet().removeIf(key -> key.startsWith("A") || key.startsWith("D"));
        
        //Para mostrar las notas de cada alumno mediante un for each
            
        if (!diccionario.isEmpty()) {
            double sumaNotas = 0;
            for (double nota : diccionario.values()) {
                sumaNotas += nota;
            }
            double mediaT = sumaNotas / diccionario.size();
            
            System.out.println("Notas de los alumnos:");
            for (String key : diccionario.keySet()) {
                System.out.println(key + " - " + diccionario.get(key));
            }
            System.out.println("Media de las notas: " + mediaT);
        }
    }

}
  
