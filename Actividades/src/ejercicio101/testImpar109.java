package ejercicio101;

public class testImpar109 {

    public static void main(String[] args) {

        try {
            Impar impar = new Impar(24);
            System.out.println(impar.toString());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
