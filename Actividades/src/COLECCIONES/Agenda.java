package COLECCIONES;

import java.util.ArrayList;


public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda() {
        listaPersonas = new ArrayList<Persona>();
    }

    public void aniadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void borrarPersona(String DNI) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getDNI().equals(DNI)) {
                listaPersonas.remove(i);
                break;
            }
        }
    }

    public void buscarPersona(String DNI) {
        boolean encontrado = false;
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getDNI().equals(DNI)) {
                System.out.println(listaPersonas.get(i));
                encontrado = true;
                break;

            }
        }
        if (!encontrado) {
            System.out.println(" No existe persona con ese DNI.. " + DNI);
        }
    }

}
