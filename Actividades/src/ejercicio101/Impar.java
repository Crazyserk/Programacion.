package ejercicio101;

public class Impar {

    int numero;

    public Impar(int num) throws Exception {
        if (num % 2 == 0) {
            throw new Exception("El numero " + num + "no es impar");
        }
        numero = num;

    }

    public String toString() {
        return "El numero almacenado es:  " + numero;
    }
}
