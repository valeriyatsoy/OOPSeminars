package employee;

public class Engineer extends Employee{
    String specialization;

    public Engineer(String newName, String newDept, String newSpecialization){
        super(newName, newDept);
        this.specialization = newSpecialization;
    }

    @Override
    public void displayInfo(){
        super.displayInfo(); //super call in the overridden method is optional
        System.out.println("Specialization: " + specialization);
    }
}
