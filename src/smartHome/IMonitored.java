package smartHome;

public interface IMonitored {
    void startMonitoring();

    void stopMonitoring();

    String getStatusReport();
}
