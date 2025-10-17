package smartHome;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SecurityCamera camera = new SecurityCamera();
        SmartThermostat thermostat = new SmartThermostat();

        manageDevice(light);
        manageDevice(camera);
        manageDevice(thermostat);
    }

    public static void manageDevice(IControllable device) {
        device.turnOn();

        if (device instanceof IConfigurable) {
            IConfigurable configurable = (IConfigurable) device;
            configurable.configure("Default Settings");
            System.out.println("Current Configuration: " + configurable.getConfiguration());
        }

        if (device instanceof IMonitored) {
            IMonitored monitored = (IMonitored) device;
            monitored.startMonitoring();
            System.out.println("Status Report: " + monitored.getStatusReport());
            monitored.stopMonitoring();
        }
        device.turnOff();
        System.out.println("-----------------------------------");
    }
}