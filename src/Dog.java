public class Dog extends Mammal implements IDomesticated {
    @Override
    public void loveHuman(Human[] favHumans) {
        for (Human h : favHumans) {
            System.out.println("Dog loves " + h.name);
        }
    }
}
