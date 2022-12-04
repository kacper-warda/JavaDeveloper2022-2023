package devices;

public class Phone extends Device {
    public Double screenSize;
    public Boolean isAndroid;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }

}
