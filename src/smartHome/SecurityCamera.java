package smartHome;

public class SecurityCamera implements IControllable, IConfigurable, IMonitored {
    private boolean isOn;
    private String configuration;
    private boolean isMonitoring;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SecurityCamera turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SecurityCamera turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void configure(String settings) {
        this.configuration = settings;
        System.out.println("SecurityCamera configured with settings: " + settings);
    }

    @Override
    public String getConfiguration() {
        return configuration;
    }

    @Override
    public void startMonitoring() {
        if (isOn) {
            isMonitoring = true;
            System.out.println("SecurityCamera started monitoring.");
        }
    }

    @Override
    public void stopMonitoring() {
        if (isOn && isMonitoring) {
            isMonitoring = false;
            System.out.println("SecurityCamera stopped monitoring.");
        }
    }

    @Override
    public String getStatusReport() {
        return isMonitoring ? "SecurityCamera is monitoring." : "SecurityCamera is not monitoring.";
    }

    public void saveFootage(String path) {
        System.out.println("Security footage saved at: " + path);
    }
}
