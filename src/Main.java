public class Main {
    public static void main(String[] args) {
        Address jungle = new Address("India", "Jungle");
        Address homeAddress = new Address("India", "Delhi");
        Car car = new Car("2023", "Toyota");
        Human human = new Human("Martin", homeAddress, false, HairColor.BLACK);
        human.car = car;
        Dog fluffy = new Dog();
        human.addNewDog(fluffy);

        human.drive(car, jungle);

        // Encounter a tiger
        Tiger tiger = new Tiger();
        System.out.println("A tiger appears!");
        tiger.attackHumans();
        human.isScared = true;
        System.out.println("The human is now scared: " + human.name);

        // Driving back home, still scared, hair turns gray
        human.drive(car, homeAddress);
        human.hairColor = HairColor.GRAY;
        System.out.println("Due to fear, the human’s hair turned " + human.hairColor);

        // Dogs love their human, fear goes away
        System.out.println("At home, dogs show love to their human...");
        for (Dog d : human.dogs) {
            d.loveHuman(new Human[]{ human });
        }
        System.out.println("The human feels calm again and is no longer scared.");
        human.isScared = false;
    }
}
