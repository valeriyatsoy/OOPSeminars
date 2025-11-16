public class Main {
    public static void main(String[] args) {
        try {
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(new Book("Effective Java", 45.99, "Joshua Bloch"));
            cart.addProduct(new Electronics("Smartphone", 999.99, 24));
            cart.addProduct(new Electronics("Laptop", 3200.0, 12));
            cart.printReceipt();

            double total = cart.getTotal();
            System.out.println("\nAttempting to pay total of $" + total + "...");

            IPayable paymentMethod = new CreditCardPayment("CARD-1234-5678");
            paymentMethod.pay(total);

            System.out.println("\nPayment completed successfully.");

        } catch (PaymentException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}