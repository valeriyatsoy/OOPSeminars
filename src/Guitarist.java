class Guitarist extends Musician {
    private int numberOfGuitars;
    private String favoriteEffectPedal;

    Guitarist(String name, Instrument instrument, int numberOfGuitars, String favoriteEffectPedal) {
        super(name, instrument);
        this.numberOfGuitars = numberOfGuitars;
        this.favoriteEffectPedal = favoriteEffectPedal;
    }

    void switchPedal() {
        System.out.println(name + " activates the " + favoriteEffectPedal + " pedal!");
    }

    @Override
    void perform() {
        System.out.println(name + " plays a guitar solo using the " + favoriteEffectPedal + " pedal!");
    }
}