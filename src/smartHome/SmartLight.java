package smartHome;

public class SmartLight implements IControllable, IConfigurable {
    private boolean isOn;
    private String configuration;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void configure(String settings) {
        this.configuration = settings;
        System.out.println("SmartLight configured with settings: " + settings);
    }

    @Override
    public String getConfiguration() {
        return configuration;
    }

    public void scheduleTurnOnOff(String schedule) {
        System.out.println("SmartLight scheduled: " + schedule);
    }
}
