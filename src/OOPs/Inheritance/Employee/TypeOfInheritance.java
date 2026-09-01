package OOPs.Inheritance.Employee;

import OOPs.Inheritance.Employee.HierarchicalInheritance.CEO;
import OOPs.Inheritance.Employee.HybridInheritance.BusinessDevelopmentManager;
import OOPs.Inheritance.Employee.MultilevelInheritance.HRDirector;
import OOPs.Inheritance.Employee.MultilevelInheritance.HRManager;
import OOPs.Inheritance.Employee.MultipleInheritance.TechLead;
import OOPs.Inheritance.Employee.SingleInheritance.Developer;

public class TypeOfInheritance {

    public static void main(String[] args){

        //single Inheritance
//        Developer dev = new Developer("Ramu Bro", 101, "Java");
//        dev.show();

        // Multiple Inheritance
//        TechLead techLead = new TechLead("Anna Dev" ,202, "Project X", 5);
//        techLead.displayInfo();

        // Multilevel Inheritance
//        HRDirector hrDirector = new HRDirector("Lucy Madam", 303);
//        hrDirector.handleHRDuties();
//        hrDirector.managerHRDepartment();

        // Hierarchical Inheritance
//        CEO ceo  = new CEO("Alex Walker", 420);
//        ceo.leadCompany();
//        ceo.makeExeDecision();

        // Hybrid Inheritance

        BusinessDevelopmentManager bdManager = new BusinessDevelopmentManager("Sam Wilson", 555);
        bdManager.coordinateBusinessDevelopment();





    }

}
