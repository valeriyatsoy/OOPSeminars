import java.util.ArrayList;

public class Human extends Mammal {
    public String name;
    public ArrayList<Dog> dogs;
    public Address address;
    public Car car;
    public boolean isScared;
    public HairColor hairColor;

    public Human(String name, Address address, boolean isScared, HairColor hairColor) {
        this.name = name;
        this.dogs = new ArrayList<>();
        this.address = address;
        this.isScared = isScared;
        this.hairColor = hairColor;
    }

    public void drive(Car car, Address address) {
        System.out.println("Driving " + car.model + " to " + address);
    }

    public void addNewDog(Dog dog){
        dogs.add(dog);
    }
}
