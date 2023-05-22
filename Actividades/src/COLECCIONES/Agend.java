package COLECCIONES;

import java.util.ArrayList;
import java.util.Scanner;

public class Agend {

    private ArrayList<Persona> listaPersonas;

    public Agend() {
        listaPersonas = new ArrayList<Persona>();
    }

    public static void main(String[] args) {

        Agend agenda = new Agend();
        Scanner agendita = new Scanner(System.in);

        while (true) {
            System.out.println(" 1. Añadir persona ");
            System.out.println(" 2. Borrar persona ");
            System.out.println(" 3. Buscar persona ");
            System.out.println(" 4. Mostrar agenda ");
            System.out.println(" 5. Ordenar agenda ");
            System.out.println(" 6. Salir ");

            int opcion = agendita.nextInt();
            agendita.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre:");
                    String nombre = agendita.nextLine();
                    System.out.println("Introduce los apellidos:");
                    String apellidos = agendita.nextLine();
                    System.out.println("Introduce el DNI:");
                    String dni = agendita.nextLine();
                    System.out.println("Introduce la edad:");
                    int edad = agendita.nextInt();
            }

        }

    }
}
