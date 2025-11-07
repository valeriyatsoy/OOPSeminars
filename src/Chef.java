class Chef extends Staff {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void serveOrder(Order order) {
        System.out.println("Chef " + name + " prepared the order");
    }
}