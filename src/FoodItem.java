class FoodItem extends MenuItem {
    public boolean isVegetarian;

    public FoodItem(String name, double price, boolean isVegetarian) {
        super(name, price);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void printItemDetails() {
        System.out.println("Food Item: " + getName() + ", Price: $" + getPrice() +
                ", Vegetarian: " + isVegetarian);
    }
}