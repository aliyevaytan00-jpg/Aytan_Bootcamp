
package sef.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Create Cat using Animal interface
        Animal cat = new Cat();

        // Create Dog using Animal interface
        Animal dog = new Dog();

        // Create Mammal object
        Mammal mammal = new Mammal("Flexy");

        // Set animal to Cat
        mammal.setAnimal(cat);

        // Cat is sleeping
        mammal.animalIsSleeping();

        // Cat is speaking
        mammal.animalIsSpeaking();

        System.out.println("-----------------------------");

        // Set animal to Dog
        mammal.setAnimal(dog);

        // Dog is sleeping
        mammal.animalIsSleeping();

        // Dog is speaking
        mammal.animalIsSpeaking();

    }
}
