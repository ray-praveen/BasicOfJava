package OOPs.Inheritance.Employee.HierarchicalInheritance;

public class CEO extends Executive{

    public CEO(String empName, int empId){
        super(empName, empId);
    }

    public void leadCompany(){
        System.out.println("CEO leading the HR department & Whole Company.");
    }
}
