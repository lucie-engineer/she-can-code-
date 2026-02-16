//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

 class Bird extends Animal{
    public void fly(){
        System.out.println("Birds does: Flying");
    }
    @Override
    public void makeSound(){
        System.out.println("Birds says: Chirp");
    }
}


class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog says: Woof");
    }
}

 class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat says: Meow");
    }
}
public class Main {
    public static void main(String[] args) {
    Bird bird= new Bird();
    bird.makeSound();
    bird.fly();

        System.out.println();

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}