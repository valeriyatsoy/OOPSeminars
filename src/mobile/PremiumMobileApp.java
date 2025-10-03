package mobile;

public class PremiumMobileApp extends MobileApp{
    int supportDuration;

    public PremiumMobileApp(String name, String version, String platform, int supportDuration) {
        super(name, version, platform);
        this.supportDuration = supportDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Support duration: " + supportDuration);
    }

}
