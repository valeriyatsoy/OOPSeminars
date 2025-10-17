package animalShelter;

public class Cat extends Animal {

    public Cat(String name, int age, boolean isVaccinated) {
        super(name, age, isVaccinated);
    }

    @Override
    public void calculateAdoptionFee() {
        adoptionFee = age * 15 + (isVaccinated ? 50 : 80);
    }

    @Override
    public String generateCarePlan() {
        StringBuilder carePlan = new StringBuilder();
        carePlan.append("Playtime Requirements: ");
        if (age < 4) {
            carePlan.append("30 minutes");
        } else {
            carePlan.append("15 minutes");
        }
        carePlan.append("\nDiet: ");
        if (age < 2) {
            carePlan.append("Kitten food");
        } else {
            carePlan.append("Adult cat food with fish oil");
        }

        if (!isVaccinated) {
            carePlan.append("Need vaccination appointment\n");
        }
        return carePlan.toString();
    }
}
