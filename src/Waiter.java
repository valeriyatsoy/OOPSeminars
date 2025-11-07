class Waiter extends Staff {
    public Waiter(String name) {
        super(name);
    }

    @Override
    public void serveOrder(Order order) {
        System.out.println("Waiter " + name + " served the order");
    }
}