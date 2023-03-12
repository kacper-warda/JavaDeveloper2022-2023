package devices;

import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_APP_SERVER = "https://kacper.apps.com";
    public Double screenSize;
    public Boolean isAndroid;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }

    void turnOn() {
        System.out.println("włączam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("jest logo");
    }


    public void installAnApp(String appName, String version, String serverAddress) {
        System.out.println("próbuję zainstalować " + appName + " w wersji " + version);
        System.out.println("z serwera " + serverAddress);
        System.out.println("sprawdzam płatność");
        System.out.println("sprawdzam kontrolę rodzicielską");
        System.out.println("sprawdzam czy masz miejsce na telefonie");
        System.out.println("pobieram");
        System.out.println("instaluje");
        System.out.println("gotowe");
    }

    public void installAnApp(List<String> appNames) {
        System.out.println("instalowanie listy aplikacji " + appNames);
        for (int i = 0; i < appNames.size(); i++) {
            String appName = appNames.get(i);
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }

}
