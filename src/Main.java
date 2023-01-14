import creatures.Pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("canis", 10.0);

        System.out.println(dog.hashCode());
        System.out.println(dog);
        System.out.println(dog.getClass());

    }
}