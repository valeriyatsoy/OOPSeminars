class Musician {
    protected String name;
    protected Instrument instrument;  // Composition

    Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    void prepare() {
        System.out.println(name + " is getting ready.");
        instrument.tune();
    }

    void perform() {
        System.out.println(name + " performs on stage with a " + instrument.getType() + ".");
    }
}