 import java.util.Scanner;
public class ejrc3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] original = new int[6];
        for (int i = 0; i < original.length; i++) {
            int number;
            do {
                System.out.print("Ingrese un número entero mayor a 0: ");
                number = scanner.nextInt();
            } while (number <= 0);
            original[i] = number;
        }

        System.out.print("Original: ");
        for (int number : original) {
            System.out.print(number + " ");
        }
        System.out.println();

        int firstNumber;
        do {
            System.out.print("Ingrese el primer número (entre 2 y 120): ");
            firstNumber = scanner.nextInt();
        } while (firstNumber < 2 || firstNumber > 120);

        int secondNumber;
        do {
            System.out.print("Ingrese el segundo número (entre 2 y 120): ");
            secondNumber = scanner.nextInt();
        } while (secondNumber < 2 || secondNumber > 120);

        boolean firstNumberInArray = false;
        boolean secondNumberInArray = false;
        int firstNumberFirstIndex = -1;
        int firstNumberLastIndex = -1;
        int secondNumberFirstIndex = -1;
        int secondNumberLastIndex = -1;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == firstNumber) {
                firstNumberInArray = true;
                if (firstNumberFirstIndex == -1) {
                    firstNumberFirstIndex = i;
                }
                firstNumberLastIndex = i;
            } else if (original[i] == secondNumber) {
                secondNumberInArray = true;
                if (secondNumberFirstIndex == -1) {
                    secondNumberFirstIndex = i;
                }
                secondNumberLastIndex = i;
            }
        }

        if (firstNumberInArray && secondNumberInArray) {
            System.out.println("Los números se encuentran en el array original.");
        } else if (firstNumberInArray) {
            System.out.println("El primer número se encuentra en el array original en las posiciones " + firstNumberFirstIndex + " y " + firstNumberLastIndex + ".");
        } else if (secondNumberInArray) {
            System.out.println("El segundo número se encuentra en el array original en las posiciones " + secondNumberFirstIndex + " y " + secondNumberLastIndex + ".");
        } else {
            System.out.println("Los números no se encuentran en el array original.");
        }
    }
}
 

