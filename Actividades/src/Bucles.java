
import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
    /*
        BUCLES FOR:
      for(int i = 0; i<=10; i++){
          System.out.println(i);
          
      }*/
    
    
    /*BUCLES IF:*/
 /*
    hora= 21;
 //sentencia IF(condición)
 if(hora>=0&& hora <=12){
     System.out.println("Buenos días");
 } else if(hora>12 && hora<=18){
     System.out.println("Buenas tardes");
 } else if (hora>19 && hora<=24){
     System.out.println("Eres gay");
 }

 */
  /*
 Scanner teclado= new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int n= teclado.nextInt();
        if (n%2==0){
            System.out.printf("El numero %d es PAR\n", n);
            
        }else{
            System.out.printf("El numero %d es Impar\n",n );
        }
 */
  Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el valor inicial:");
        int in= teclado.nextInt();
        System.out.println("Ingrese el valor final:");
        int fin= teclado.nextInt();
        for(int i=in;i<=fin;i+=2) {
            System.out.println(""+1);
        }
    }
}