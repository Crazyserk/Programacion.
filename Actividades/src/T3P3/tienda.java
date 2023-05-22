package T3P3;

import java.util.ArrayList;

public class tienda {

    private ArrayList<zapatilla> tiendazapatillus;
//   Insertamos una ArrayList, con una lista de zapatillas.

    public tienda() {
        tiendazapatillus = new ArrayList<zapatilla>();
    }

    // Este método introducirá zapatillas de todos los modelos que le asignemos.
    public void meterzapatillas(zapatilla Zapatillas) {
        tiendazapatillus.add(Zapatillas);
    }

    // Busca el modelo que hayamos asignado en la base de datos de la tienda. --> Recibe como argumento "modelo"
    public void BuscarEnBase(String modelo) {
        boolean detected = false;
        for (int i = 0; i < tiendazapatillus.size(); i++) {
            if (tiendazapatillus.get(i).getModelo().equals(modelo)) {
                System.out.println(tiendazapatillus.get(i));
                detected = true;
                break;
            }
        }
        if (!detected) {
            System.out.println(" No se encontró el modelo especificado... " + modelo);

        }
    }
    // Este método, va a recibir como argumento "modelo" y  se encarga de borrar el modelo una vez que ya exista

    public void borrarModelo(String modelo) {
        for (int i = 0; i < tiendazapatillus.size(); i++) {
            if (tiendazapatillus.get(i).getModelo().equals(modelo)) {
                tiendazapatillus.remove(i);
                break;
            }
        }
    }
}
