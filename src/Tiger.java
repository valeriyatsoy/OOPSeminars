public class Tiger extends Mammal implements IWild {
    @Override
    public void attackHumans() {
        System.out.println("Tiger attacks humans!");
    }

    @Override
    public void breathe() {
        System.out.println("Tiger breathes air.");
    }

    @Override
    public void reproduce() {
        System.out.println("Tiger gives birth to cubs.");
    }
}
