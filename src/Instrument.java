class Instrument {
    private String type;

    public String getType() {
        return type;
    }

    Instrument(String type) {
        this.type = type;
    }

    void tune() {
        System.out.println("Tuning the " + type + "...");
    }
}