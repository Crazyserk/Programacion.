package ejercicio101;

public class Testgato {

    public static void main(String[] args) throws Exception {
        try {
            Gato gato1 = new Gato("Mikel", 3);
            //  Gato gato2 = new Gato("Misifu", -3);
            gato1.setNombre("Marlene");
            gato1.setEdad(-2);

        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }

    }
}
