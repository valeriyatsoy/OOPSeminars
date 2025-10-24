class Drummer extends Musician {
    private int numberOfDrums;
    private boolean usesDoubleBass;

    Drummer(String name, Instrument instrument, int numberOfDrums, boolean usesDoubleBass) {
        super(name, instrument);
        this.numberOfDrums = numberOfDrums;
        this.usesDoubleBass = usesDoubleBass;
    }

    void warmUp() {
        System.out.println(name + " warms up with a quick drum roll.");
    }

    @Override
    void perform() {
        System.out.print(name + " performs a drum rhythm");
        if (usesDoubleBass) System.out.print(" with double bass technique");
        System.out.println("!");
    }
}