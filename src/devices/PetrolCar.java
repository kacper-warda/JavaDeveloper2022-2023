package devices;

public class PetrolCar extends Car {
    Double tankVolume;

    public PetrolCar(Integer id, String producer, String model, String fuelType, Double tankVolume) {
        super(id, producer, model, fuelType);
        this.tankVolume = tankVolume;
    }

    @Override
    public void refuel() {
        System.out.println("jedziesz na stację");
        System.out.println("przeklinasz już z daleka");
        System.out.println("stajesz pod dystrybutorem");
        System.out.println("obiecujesz sobie wypełnić donos na objatka");
        System.out.println("tankujesz");
        System.out.println("płacisz");
        System.out.println("płaczesz");
    }
}
