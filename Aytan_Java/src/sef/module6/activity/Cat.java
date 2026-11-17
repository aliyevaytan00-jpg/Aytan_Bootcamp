
package sef.module6.activity;

public class Cat implements Animal {

    // Implementation of animalSound()
    @Override
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    // Implementation of sleep()
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}
