class DrinkItem extends MenuItem {
    public boolean isColdDrink;

    public DrinkItem(String name, double price, boolean isColdDrink) {
        super(name, price);
        this.isColdDrink = isColdDrink;
    }

    @Override
    public void printItemDetails() {
        System.out.println("Drink Item: " + getName() + ", Price: $" + getPrice() +
                ", Cold Drink: " + isColdDrink);
    }
}