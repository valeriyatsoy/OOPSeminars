import java.util.*;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException("Product cannot be null.");
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (!products.remove(product))
            System.out.println("Product not found: " + product.getName());
    }

    public double getTotal() {
        double totalPrice = 0;
        for (Product p: products){
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public void printReceipt() {
        System.out.println("\n===== RECEIPT =====");
        for (Product p : products) {
            System.out.println(p + " | " + p.getDetails());
        }
        System.out.println("Total: $" + getTotal());
    }
}