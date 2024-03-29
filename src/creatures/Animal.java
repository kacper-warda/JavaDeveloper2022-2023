package creatures;

public abstract class Animal implements Feedable, Saleable {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 800.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    private static final Double DEFAULT_WALK_DISTANCE = 2.0;

    public final String species;
    public String name;
    protected Double weight;
    protected Boolean isAlive;


    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        if (weight <= 0) {
            System.out.println("Sorry, błędna waga, przypisano wagę domyślną");
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        } else {
            this.weight = weight;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne że żyję!");
        } else {
            System.out.println("no niestety, trochę za późno");
        }
    }

    public void feed(Double foodWeight) {
        if (isAlive) {
            weight += (foodWeight * 0.3);
            System.out.println("dzięki za żarcie :) ");
        } else {
            System.out.println("trochę za późno :|");
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void takeForAWalk() {
        this.takeForAWalk(DEFAULT_WALK_DISTANCE);
    }

    public void takeForAWalk(Double distance) {
        if (!isAlive) {
            System.out.println("HALO POLICJA!");
        } else {
            weight -= (distance * 0.1);
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzięki za spacer");
            }
        }
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("sorry, nie masz kasy");
        } else if (seller.pet != this) {
            System.out.println("sorry, nie masz zwierzaka");
        } else if (this instanceof Human) {
            System.out.println("zapraszam na rozmowę w celu ustalnie planu dalszego życia");
            System.out.println("w pierdlu");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println("transakcja udana, zwierzyna sprzedana");
        }
    }


    public String toString() {
        return "To jest klasa Animal, gatunek " + this.species;
    }

}