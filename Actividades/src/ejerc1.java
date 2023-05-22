   import java.util.Scanner;

public class ejerc1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.print("Ingrese un número distinto de cero: ");
            x = scanner.nextInt();
        } while (x == 0);
        int suma = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                suma += i;
            } else {
                suma -= i;
            }
        }
        System.out.println("La suma es: " + suma);
    }
}

  
