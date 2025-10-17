package animalShelter;

public class Dog extends Animal {

    public Dog(String name, int age, boolean isVaccinated) {
        super(name, age, isVaccinated);
    }

    @Override
    public void calculateAdoptionFee() {
        adoptionFee = age * 20 + (isVaccinated ? 100 : 150);
    }

    @Override
    public String generateCarePlan() {
        StringBuilder carePlan = new StringBuilder();
        carePlan.append("Exercise Requirements: ");
        if (age < 5) {
            carePlan.append("2 hours");
        } else {
            carePlan.append("1 hour");
        }
        carePlan.append("Diet: ");
        if (age < 3) {
            carePlan.append("High-protein food\n");
        } else {
            carePlan.append("Balanced diet with supplements\n");
        }
        if (!isVaccinated) {
            carePlan.append("Medical Check: Recommend vaccination appointment\n");
        }
        return carePlan.toString();
    }

}
