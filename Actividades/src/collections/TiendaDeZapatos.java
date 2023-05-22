package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaDeZapatos {

    private ArrayList<Zapato> zapatos;

    public TiendaDeZapatos() {
        this.zapatos = new ArrayList<>();
    }

    public void agregarZapato() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el modelo del zapato: ");
        String modelo = input.nextLine();

        System.out.print("Ingrese el precio del zapato: ");
        double precio = input.nextDouble();

        System.out.print("Ingrese la talla del zapato: ");
        int talla = input.nextInt();

        Zapato zapato = new Zapato(modelo, precio, talla);
        this.zapatos.add(zapato);
        System.out.println("Zapato agregado correctamente.");
    }

    public void buscarZapato() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el modelo del zapato: ");
        String modelo = input.nextLine();

        for (Zapato zapato : this.zapatos) {
            if (zapato.getModelo().equals(modelo)) {
                System.out.println("Modelo: " + zapato.getModelo());
                System.out.println("Precio: " + zapato.getPrecio());
                System.out.println("Talla: " + zapato.getTalla());
                return;
            }
        }

        System.out.println("El modelo de zapato no se encuentra en la tienda.");
    }
}


