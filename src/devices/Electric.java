package devices;

public class Electric extends Car {
    Double voltage;

    public Electric(Integer id,
                    String producer,
                    String model,
                    String fuelType,
                    Double voltage) {

        super(id, producer, model, fuelType);
        this.voltage = voltage;
        System.out.println("utworzono samochód elektryczny");
    }

    @Override
    public void refuel() {
        System.out.println("jesteś cwany masz fotowoltaikę");
        System.out.println("podłączasz do gniazdka");
        System.out.println("masz nadzieję że żona nie urodzi zanim się naładuje");
        System.out.println("czekasz");
        System.out.println("długo czekasz");
        System.out.println("ale mało płacisz");
        System.out.println("tzn za prąd, bo za samochód dużo");
    }
}
