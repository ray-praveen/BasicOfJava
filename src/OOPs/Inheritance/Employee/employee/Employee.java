package OOPs.Inheritance.Employee.employee;

public class Employee {

    protected String name;
    protected int employeeId;

    public Employee(String empName, int empID){
        this.name = empName;
        this.employeeId = empID;
    }
    public void display(){
        System.out.println("Employee: " + name+ ", ID: " + employeeId);
    }

}
