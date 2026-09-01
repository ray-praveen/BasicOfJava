package OOPs.Inheritance.Employee.HybridInheritance;

import OOPs.Inheritance.Employee.employee.Employee;

public class MarketingManager extends Employee {

    public MarketingManager(String empName,  int empId){
        super(empName, empId);

    }

    public void createMarketingStrategy(){
        System.out.println("Marketing Manager creating a market strategy");
    }

}
