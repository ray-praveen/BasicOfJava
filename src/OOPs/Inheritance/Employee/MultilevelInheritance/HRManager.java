package OOPs.Inheritance.Employee.MultilevelInheritance;

import OOPs.Inheritance.Employee.employee.Employee;

public class HRManager extends Employee {

    public HRManager(String empName, int empId){
        super(empName, empId);

    }

    public void handleHRDuties(){
        System.out.println("HR Manager handling human resource duties.");
    }

}
