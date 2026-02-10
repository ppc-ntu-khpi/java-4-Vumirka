package test;

import domain.Rabbit;

public class TestAnimal {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Vukhan", 3, "Californian");
        
        System.out.println(rabbit);
        System.out.println();
        
        rabbit.eat();
        rabbit.speak();
        rabbit.graze();
        rabbit.hop();
        rabbit.dig();
    }
}
