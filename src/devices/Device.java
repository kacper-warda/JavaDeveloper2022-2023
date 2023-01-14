package devices;

public abstract class Device {
    public final Integer id;
    public final String producer;
    public final String model;

    public Device(Integer id, String producer, String model) {
        this.id = id;
        this.producer = producer;
        this.model = model;
    }

    abstract void turnOn();

}
