class Beverage extends MenuItem {
    private boolean isHot;

    public Beverage(String itemId, String name, double price, boolean dineIn,
                    double takeawayFee, boolean isHot) {
        super(itemId, name, price, dineIn, takeawayFee);
        this.isHot = isHot;
    }

    @Override
    public double calculatePrice() {
        double total = price;
        // Add takeaway fee if not dine-in
        if (!dineIn) {
            total += takeAwayFee;
        }
        // Add small extra charge for hot beverages (special cups)
        if (isHot) {
            total += 0.30;
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + (dineIn ? " (Dine-In)" : " (Takeaway)") +
                " - " + (isHot ? "Hot Beverage" : "Cold Beverage") +
                " - Price: $" + String.format("%.2f", calculatePrice()));
    }
}