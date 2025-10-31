public class Plant extends LivingBeing {
    @Override
    public void breathe() {
        System.out.println("Gas exchange process");
    }

    @Override
    public void reproduce() {
        System.out.println("Spreading seeds.");
    }
}
