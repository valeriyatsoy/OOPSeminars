package animalShelter;

public abstract class Animal {
    protected String name;
    protected int age;
    protected boolean isVaccinated;
    protected double adoptionFee;

    public Animal(String name, int age, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public abstract void calculateAdoptionFee();

    public abstract String generateCarePlan();

    public void displayDetails() {
        calculateAdoptionFee();
        System.out.println("Name: " + name + "\nAge:" + age + "\nVaccinated: " + (isVaccinated ? "Yes" : "No") + "\nAdoption Fee: $" + adoptionFee);
        System.out.println("Care Plan: \n" + generateCarePlan());
        System.out.println("---------------------------------- - ");
    }

}
