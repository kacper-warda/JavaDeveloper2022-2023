import creatures.Human;
import devices.Car;

public class Main {
    public static void main(String[] args) {

        Human me = new Human("kacper");
        me.feed(2.0);
        me.takeForAWalk(1.0);
        System.out.println(me.species);
        System.out.println(Human.DEFAULT_ANIMAL_WEIGHT);

        Car fiat = new Car(17, "vw", "passat", "diesel");
        fiat.millage = 332123.0;

        System.out.println(fiat.producer);
        System.out.println(me.species);

    }
}