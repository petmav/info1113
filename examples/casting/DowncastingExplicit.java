import java.util.ArrayList;

public class DowncastingExplicit {

    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        Animal a4 = new Animal();

        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);

        ArrayList<Dog> dogList = DowncastingExplicit.parseArrayList(animalList);
        System.out.println("Number of dogs found: " + dogList.size());
    }

    public static ArrayList<Dog> parseArrayList(ArrayList<Animal> list) {

            ArrayList<Dog> dogs = new ArrayList<Dog>();
            
            for (Animal a : list) {
                try {
                    Dog d = (Dog) a;
                    dogs.add(d);
                    System.out.println("Found a dog!");
                } catch (ClassCastException e) {
                    System.out.println("Not a dog, instead found " + a.getClass().getName());
                }
            }

            return dogs;
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