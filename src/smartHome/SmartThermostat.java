package smartHome;

public class SmartThermostat implements IControllable, IConfigurable {
    private boolean on;
    private String configuration;
    private double currentTemperature = 22.5;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("SmartThermostat turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("SmartThermostat turned off.");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void configure(String settings) {
        this.configuration = settings;
        System.out.println("SmartThermostat configured with settings: " + settings);
    }

    @Override
    public String getConfiguration() {
        return configuration;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }
}
