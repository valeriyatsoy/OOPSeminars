public class Mammal extends LivingBeing {
    @Override
    public void breathe() {
       System.out.println("Mammal breathes air.");
    }

    @Override
    public void reproduce() {
        System.out.println("Giving live birth.");
    }
}
