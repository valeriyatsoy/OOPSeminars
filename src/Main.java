public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Instrument("guitar");
        Instrument drums = new Instrument("drum set");

        Guitarist john = new Guitarist("John", guitar, 3, "distortion");
        Drummer anna = new Drummer("Anna", drums, 5, true);

        john.prepare();
        john.switchPedal();
        john.perform();

        anna.prepare();
        anna.warmUp();
        anna.perform();
    }
}
