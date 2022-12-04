package creatures;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;

    public Human(String firstName) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
    }
}
