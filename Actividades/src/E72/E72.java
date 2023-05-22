
package E72;
/*
 public Persona(String nombre, int edad, char sexo, String pais) 
*/

public class E72 {
  
    public static void main(String[] args) {
        System.out.println("En caso de edad, pais, o sexo erróneo, se le asignará uno aleatoriamente.");
        Persona juan = new Persona ("juan",0,'w',"hawai" );
        System.out.println(juan);
        juan.saludar();
        juan.mostrarDatos();
        juan.esMayorEdad();
        juan.saludo(3);

    }

}
