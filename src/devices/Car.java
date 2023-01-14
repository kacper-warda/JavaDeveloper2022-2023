package devices;

public abstract class Car extends Device {
    public Double millage;
    public Double engineVolume;
    public String fuelType;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }

    void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("odpalił");
    }

    public abstract void refuel();
}
