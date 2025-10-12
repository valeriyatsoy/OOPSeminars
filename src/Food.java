class Food extends MenuItem {
    private int preparationTimeMins;

    public Food(String itemId, String name, double price, boolean dineIn,
                double takeawayFee, int preparationTime) {
        super(itemId, name, price, dineIn, takeawayFee);
        this.preparationTimeMins = preparationTime;
    }

    @Override
    public double calculatePrice() {
        double total = price;
        // Add takeaway fee if not dine-in
        if (!dineIn) {
            total += takeAwayFee;
        }
        // Add preparation time extra charge: $0.10 per minute
        total += preparationTimeMins * 0.10;
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + (dineIn ? " (Dine-In)" : " (Takeaway)") +
                " - Preparation Time: " + preparationTimeMins + " min " +
                "Price: $" + String.format("%.2f", calculatePrice()));
    }
}