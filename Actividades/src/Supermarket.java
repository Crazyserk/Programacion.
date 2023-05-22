
import java.util.ArrayList;
import java.util.Scanner;

public class Supermarket {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        double totalPrice = 0;

        while (continueInput) {
            System.out.print("Introduce el nombre del producto: ");
            String name = scanner.nextLine();
            System.out.print("Introduce el precio del producto: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            products.add(new Product(name, price));
            totalPrice += price;

            System.out.print("¿Desea introducir otro producto? (s/n) ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                continueInput = false;
            }
        }

        System.out.println("Productos comprados: " + products.size());
        for (Product product : products) {
            System.out.println(product.name + " - " + product.price);
        }
        System.out.println("Importe total: " + totalPrice);
    }
}

class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
