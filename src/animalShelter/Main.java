package animalShelter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Boris", 3, true));
        animals.add(new Dog("Buddy", 1, false));

        for (Animal animal: animals) {
            animal.displayDetails();
        }
    }
}