import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Interface
interface Billable {
    double calculate();
}

// Product class implementing Billable interface
class Product implements Billable {
    private String id;
    private String name;
    private int quantity;
    private double unitPrice;
    private double total;

    public Product(String id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = quantity * unitPrice;
    }

    public double calculate() {
        return total;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10d  %.2f   %.2f",
                id, name, quantity, unitPrice, total);
    }
}

// Main class
public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting order details
        System.out.print("Enter Order Number: ");
        int orderNumber = scanner.nextInt();
        System.out.print("Enter Order Date: ");
        String orderDate = scanner.next();

        // Creating products
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Product " + i + ":");
            System.out.print("Enter Product ID: ");
            String id = scanner.next();
            System.out.print("Enter Product Name: ");
            String name = scanner.next();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();

            Product product = new Product(id, name, quantity, unitPrice);
            products.add(product);
        }

        // Displaying the bill
        System.out.println("\n===========================================");
        System.out.println("               INVOICE BILL");
        System.out.println("===========================================");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Date: " + orderDate);
        System.out.println("-------------------------------------------");
        System.out.println("Product ID  Product Name       Quantity  Unit Price  Total");
        System.out.println("-------------------------------------------");
        double grandTotal = 0;

        for (Product product : products) {
            System.out.println(product);
            grandTotal += product.calculate();
        }

        System.out.println("-------------------------------------------");
        System.out.printf("%-46s %.2f\n", "Grand Total:", grandTotal);
    }
}
