package OOPs.Inheritance.Employee.MultilevelInheritance;

public class HRDirector extends HRManager{

    public HRDirector(String empName, int empId){
        super(empName, empId);
    }

    public void managerHRDepartment(){
        System.out.println("HR Director managing the HR department.");
    }
}
