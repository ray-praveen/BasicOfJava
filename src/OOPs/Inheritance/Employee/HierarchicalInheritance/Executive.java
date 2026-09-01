package OOPs.Inheritance.Employee.HierarchicalInheritance;

import OOPs.Inheritance.Employee.employee.Employee;

public class Executive extends Employee {

    public Executive(String empName, int empId){
        super(empName, empId);

    }

    public void makeExeDecision(){
        System.out.println("Executives Manager handling human resource duties.");
    }
}
