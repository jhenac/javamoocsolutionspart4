// Product.java
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
// ----------------------------------------------------------------------------------------
// Main.java
public class Main {

    public static void main(String[] args) {
        // This is an empty main method for testing the Product class
        // Try:

         Product product = new Product("Banana", 1.1, 13);
         product.printProduct();
    }
}
