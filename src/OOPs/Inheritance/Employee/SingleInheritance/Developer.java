package OOPs.Inheritance.Employee.SingleInheritance;
import OOPs.Inheritance.Employee.employee.*;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String empName, int empId, String lang){
        super(empName, empId);
        this.programmingLanguage = lang;

    }

    public void show(){
        display();
        System.out.println("Specialization: Developer, Programming Language: " + programmingLanguage);
    }
}
