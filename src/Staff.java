abstract class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public abstract void serveOrder(Order order);
}