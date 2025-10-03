package mobile;

import employee.Engineer;

public class Main {
    public static void main(String[] args) {
        PremiumMobileApp premiumMobileApp = new PremiumMobileApp(
                "Telegram",
                "15.5",
                "Android",
                1
        );
        premiumMobileApp.displayDetails();
    }
}