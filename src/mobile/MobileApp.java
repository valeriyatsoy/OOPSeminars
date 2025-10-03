package mobile;

public class MobileApp extends SoftwareProduct{
    String platform;

    public MobileApp(String name, String version, String platform) {
        super(name, version);
        this.platform = platform;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Mobile platform: " + platform);
    }
}
