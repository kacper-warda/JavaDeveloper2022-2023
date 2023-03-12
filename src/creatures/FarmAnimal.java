package creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("żegnajcieee");
    }

    public String toString() {
        return "Elo to zwierze z farmy, a konkretnie "
                + this.species;
    }
}
