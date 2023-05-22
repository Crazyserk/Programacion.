package E71;

public class pruebaImpresion {

    public static void main(String[] args) {
        int[] arra = {0, 8, 9, 4, 3, 0, 1, 0, 8, 0, 0, 2, 0};

        int numerosNoCero = 0;
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] != 0) {
                numerosNoCero++;
            }
        }
        //Necesitamos que esto se imprima de la siguiente manera:
        // [8,9,4,3,1,8,2]
        System.out.print("[");

        for (int i = 0; i < arra.length; i++) {
            if(arra[i]!=0){
                System.out.print(arra[i]);
            if (numerosNoCero > 1) {
                System.out.print(",");
                numerosNoCero--;
            }
            }
          /*  if(siguienteEsCero(arra, i)){
                System.out.print(",");
            }*/
        }
        System.out.println("]");

    }
    
    public static boolean siguienteEsCero(int[] array, int indiceActual){
        
        return false;
    }

}
