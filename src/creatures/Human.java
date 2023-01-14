package creatures;

import devices.Car;
import devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    public Phone mobile;
    public Double cash;

    public Human(String firstName) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
        this.cash = 0.0;
    }
}
