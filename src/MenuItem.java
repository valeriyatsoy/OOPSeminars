class MenuItem {
    private String itemId;
    protected String name;
    protected double price;
    protected boolean dineIn;
    protected double takeAwayFee;

    public String getItemId() {
        return itemId;
    }

    public MenuItem(String itemId,
                    String name,
                    double price,
                    boolean dineIn,
                    double takeawayFee) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.dineIn = dineIn;
        this.takeAwayFee = takeawayFee;
    }

    public double calculatePrice() {
        // Default implementation; overridden by subclasses
        if (dineIn) {
            return price;
        } else {
            return price + takeAwayFee;
        }
        //return dineIn ? price : (price + takeAwayFee); //the same logic using Elvis operator
    }

    public void displayDetails() {
        // Default implementation; overridden by subclasses
        System.out.println(name + " - Price: $" + calculatePrice());
    }

    // Overloaded method (method overloading demonstration)
    public void displayDetails(boolean showPriceOnly) {
        if (showPriceOnly) {
            System.out.println("Price: $" + calculatePrice());
        } else {
            displayDetails(); // calls the other version
        }
    }
}