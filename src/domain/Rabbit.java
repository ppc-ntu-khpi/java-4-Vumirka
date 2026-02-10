package domain;

public class Rabbit extends Herbivore {
    private String breed;

    public Rabbit(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public Rabbit() {
        this("Fluffy", 2, "Common rabbit");
    }

    public Rabbit(String name) {
        this(name, 2, "Common rabbit");
    }

    public void hop() {
        System.out.println("Rabbit is hopping on the grass...");
    }

    public void dig() {
        System.out.println("Rabbit is digging a burrow...");
    }

    @Override
    public void graze() {
        System.out.println("Rabbit is eating juicy grass and clover...");
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nBreed:\t" + this.breed + 
               "\n\nThis is a Rabbit!";
    }

    @Override
    public void speak() {
        System.out.println("Rabbit thumps its paws and sniffs!");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating carrots and cabbage...");
    }
}
