package COLECCIONES;

import java.util.LinkedList;

public class Cola_de_Supermercado {

    private LinkedList<Persona> personas;

    public Cola_de_Supermercado() {
        personas = new LinkedList<>();
    }

    public boolean estaVacia() {
        return personas.isEmpty();
    }

    public void entrar(Persona persona) {
        personas.addLast(persona);
    }

    public void salir() {
        if (!estaVacia()) {
            Persona persona = personas.removeFirst();
            System.out.println(persona.toString() + " abandonó la cola.. ");
        }
    }

    public Persona Primero() {
        if (!estaVacia()) {
            return personas.getFirst();
        } else {
            System.out.println(" La cola está vacía.. ");
            return null;
        }
    }

    public int Cantidad() {
        return personas.size();
    }
}
