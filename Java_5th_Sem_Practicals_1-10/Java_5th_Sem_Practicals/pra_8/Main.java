class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        this("Unknown", 0.0, 0);
    }

    Product(String productName) {
        this(productName, 0.0, 0);
    }

    Product(String productName, double price) {
        this(productName, price, 1);
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + calculateTotalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Keyboard");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Monitor", 8500, 2);

        System.out.println("No-argument constructor:");
        p1.display();

        System.out.println("Product name constructor:");
        p2.display();

        System.out.println("Product name and price constructor:");
        p3.display();

        System.out.println("All-fields constructor:");
        p4.display();
    }
}
