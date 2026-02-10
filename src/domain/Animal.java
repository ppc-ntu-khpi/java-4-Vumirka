package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {
        name = "generic animal";
        weight = 3;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal is making sounds...");
    }

    @Override
    public String toString() {
        return "My animal:" + 
               "\nName:\t" + name + 
               "\nWeight:\t" + weight + " kg";
    }
}
