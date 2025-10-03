package employee;

public class Employee {
    String name;
    String department;

    public Employee(String newName, String newDept){
        this.name = newName;
        this.department = newDept;
    }

    public void displayInfo(){
        System.out.println("Employee name: " + name + "\nDepartment: " + department);
    }
}
