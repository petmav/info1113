public class TestUpcasting {

    public static void main(String[] args) {
        Animal myDog = new Dog(); // Implicit upcast to Animal
        Animal myCat = new Cat(); // Implicit upcast to Animal
        
        // Despite myDog and myCat being of type Animal, the correct subclass method is called
        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow
        
        // Array of Animals can hold different types of animals
        Animal[] animals = { new Dog(), new Cat(), new Animal() };
        for (Animal animal : animals) {
            animal.makeSound(); // Outputs: Bark, Meow, Animal sound
        }
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
